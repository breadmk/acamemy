package ch05_array;

/* 프롬프트창에서 실행시에는 > java Ex06_commad_array 홍의장군 123 "hello world"
* eclipse에서 실행시에는  > run configuration의 arguments 탭에서 
* 					홍의장군 공백입력123 "hello world" 입력
* 					또는 
*					홍의장군 enter 123 enter "hello world" 입력
* 					=>> 공백이 포함된 문자열은 "큰 따옴표" 로 감싸줘야 한다.
*/
//[Java의정석]ch5_배열 - 슬라이드14, 교재 p212 참고
public class Ex06_command_array {

	public static void main(String[] args) {
		System.out.println("arg[0]="+args[0]);
		System.out.println("arg[1]="+args[1]);
		System.out.println("arg[2]="+args[2]);
		
		System.out.println("------------------");
//	함수호출 : 함수명(); p.254
		showMsg("세종대왕"," 훈민정음!");
		showMsg("이순신");
		showMsg();
	}
//	메소드(함수)선언 (p.252)
//	함수종류4개중에서 2개
//	메소드 오버로딩(overloading- p.283)
//	메소드 함수 선언
	public static void showMsg(String name,String msg) {
		System.out.println(name+"님의 메세지는" + msg);
	}

	public static void showMsg(String name) {
		System.out.println(name+"님 환영해요!");
}
	
	public static void showMsg() {
		System.out.println("showMsg()메소드 호출성공!");
	}
}
