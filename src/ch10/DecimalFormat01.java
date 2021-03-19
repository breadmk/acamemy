package ch10;

import java.text.DecimalFormat;

// DesimalFormat - 교재 540
// -숫자의 형식화
public class DecimalFormat01 {

	public static void main(String[] args) {

		double num = 1234567.89;
		
		DecimalFormat df = null;
		
		df = new  DecimalFormat("#");//1234568 반올림
		System.out.println(df.format(num));

		df = new  DecimalFormat("#.#");	//1234567.9	반올림
		System.out.println(df.format(num));
		
		df = new  DecimalFormat("##########.#####");	//0001234567.89000
		System.out.println(df.format(num));
		
		df = new  DecimalFormat("###,###,###.000");	//0001234567.89000 //지가 알아서 ,찍음
		System.out.println(df.format(num));
		
		System.out.println();
//		----------------------------------------------------
		df = new  DecimalFormat("0");//1234568 반올림
		System.out.println(df.format(num));
		
		df = new  DecimalFormat("0.0");	//1234567.9	반올림
		System.out.println(df.format(num));
		
		df = new  DecimalFormat("0000000000.00000");	//0001234567.89000
		System.out.println(df.format(num));
		
		

		
		
		
	}

}
