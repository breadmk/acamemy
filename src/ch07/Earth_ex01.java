package ch07;

//	상수(static final)
public class Earth_ex01 {
	public static void main (String[] args) {
		System.out.println("지굼의 반지름(km)= "+ Earth.EARTH_RADIUS);
		System.out.println("지굼의 표면적(km^2)= " +Earth.EARTH_SURFACE_AREA);
		
//	field [접근제어자][속성] 데이터타입 변수명 = [초기값];
	
//	constructor [접근제어자]클래스명(매개변수리스트){}
	
//	method	[접근제어자][속성] 리턴 유형 메소드명(매개변수리스트){}
	
	}
}

// 상수는 모두 대문자로 작성하는 것이 관례. 혼합된 이름이면 _ 로 결합.
// 초기값이 단순 값이라면 선언시에 초기값을 제시하는 것이 일반적.
// 복잡한 초기화일 경우는 정적 블로에서도 할 수 있다.
class Earth{
	
	static final double EARTH_RADIUS = 6400;	//둘레
	static final double EARTH_SURFACE_AREA;
//	The blank final field EARTH_SURFACE_AREA may not have been initialized
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS;
	}

}















