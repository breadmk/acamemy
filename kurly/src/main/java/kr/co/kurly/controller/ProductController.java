package kr.co.kurly.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kr.co.kurly.dao.MemberDao;
import kr.co.kurly.dao.ProductDao;
import kr.co.kurly.dto.DeaDto;
import kr.co.kurly.dto.JungDto;
import kr.co.kurly.dto.ProductDto;

@Controller
public class ProductController {
	
	@Autowired
	public SqlSession sqlSession;
	
	@RequestMapping("/product/pwrite")
	public String pwrite(Model model) {
		
		//dae테이블에서 대분류에 대한 내용을 읽어와서 뿌려준다.
		ProductDao pdao = sqlSession.getMapper(ProductDao.class);
		List<DeaDto> list = pdao.get_dea();
		List<JungDto> jlist = pdao.get_jung("01");
		model.addAttribute("list",list);
		model.addAttribute("jlist",jlist);
		return "/product/pwrite";
	}
	
	@RequestMapping("/product/get_jung")
	public void get_jung(PrintWriter out,HttpServletRequest request) {
		ProductDao pdao = sqlSession.getMapper(ProductDao.class);
		String deacode = request.getParameter("deacode");
		List<JungDto> jlist = pdao.get_jung(deacode);
		String code = "";
		String title = "";
		for(int i=0; i<jlist.size(); i++) 
		{
			code=code+jlist.get(i).getCode()+",";
			title=title+URLEncoder.encode(jlist.get(i).getTitle())+",";
		}
		out.print(code);
		out.print(title);
	}
	
	@RequestMapping("/product/pwrite_ok")
	public String pwrite_ok(HttpServletRequest request,ProductDto pdto) throws IOException
	{
		String path=request.getRealPath("resources/pimg");
		int max=1024*1024*10;
		MultipartRequest multi=new MultipartRequest(request,path,max,"utf-8",new DefaultFileRenamePolicy());
		
		ProductDao pdao = sqlSession.getMapper(ProductDao.class);
		// 상품코드 완성하기
		String pcode = multi.getParameter("pcode");
		Integer num = pdao.get_MaxPcode(pcode);
		num++;
		String num2 = num.toString();
		switch(num2.length())
		{
			case 1: num2="000"+num2; break;
			case 2:	num2="00"+num2; break;
			case 3:	num2="0"+num2; break;
		}
		pcode = pcode+num2;
		System.out.println(pcode);
		// request된 값을 dto클래스에 setter하기
		pdto.setPcode(multi.getParameter("pcode"));
		pdto.setTitle(multi.getParameter("title"));
		pdto.setSubtitle(multi.getParameter("subtitle"));
		pdto.setPrice(Integer.parseInt(multi.getParameter("price")));
		pdto.setPdan(multi.getParameter("pdan"));
		pdto.setPwe(multi.getParameter("pwd"));
		pdto.setBgubun(Integer.parseInt(multi.getParameter("bgubun")));
		pdto.setMade(multi.getParameter("made"));
		pdto.setPal(multi.getParameter("pal"));
		pdto.setSu(Integer.parseInt(multi.getParameter("su")));
		pdto.setHalin(Integer.parseInt(multi.getParameter("halin")));
		pdto.setMimg(multi.getFilesystemName("mimg")); // 실제 저장되는 이름
		pdto.setPcon(multi.getFilesystemName("pcon"));
		pdto.setPimg(multi.getFilesystemName("pimg"));
		pdto.setPinfo(multi.getFilesystemName("pinfo"));
		
		pdao.pwrite_ok(pdto);
		return "redirect:/product/pwrite";
	}
}


















