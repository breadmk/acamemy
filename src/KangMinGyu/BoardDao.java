package KangMinGyu;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
		
//			다형성
	private List<BoardDto> list =new ArrayList<BoardDto>();

	public void setBoardDto(String title,String content) {
			BoardDto bd = new BoardDto();
			bd.setTitle(title);
			bd.setContent(content);
			list.add(bd);
	}

	public List<BoardDto> getBoardDto(){
			return list;
	}
}