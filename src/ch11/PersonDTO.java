package ch11;


//	Interface를 구현하는 클래스 선언
//	[접근제어자][속성] class 클래스명 [extends 조상클래스명] implements 인터페이스명1,인터페이스명2,...,인터페이스N

// 인터페이스는 상수와 추상메서드만으로 구성된 (추상)클래스의 일종이므로
// 인터페이스를 상속받은 구현클래스에서는
// 인터페이스에서 선언한 추상메서드를 반드시 꼭 기필코 재정의(@Override)해야한다.

// 여기에서는 Comparable 인터페이스의 int compareTo(Object arg0)를 오버라이딩 해야 한다.

public class PersonDTO implements Comparable<PersonDTO> {
//	public class PersonDTO {
	
		//field
		private String name; //이름
		private int age;	 //나이
		
		//constructor 
		// order by 컬럼명 정렬방법 (Oracle)
		//new  PersonDTO(String name, int age)
		//new  PersonDTO("홍길동",100)
		//new  PersonDTO("홍길동",1)
		public PersonDTO() {}
		public PersonDTO(String name,int age) {
			this.name=name;
			this.age=age;
		}
		
		//정렬기능
		@Override
		public int compareTo(PersonDTO obj) {		//obj는 참조변수명
			if(this.age < obj.age) {
				return 1;	//-1하면 나이 오름차순 정렬
			}else if(this.age == obj.age) {
				return 0;
			}else{
				return -1;
			}
		}
		
		/* Returns:
		a negative integer, zero, or a positive integer as this 
		object is less than, equal to, or greater than the specified object.
		기준 1 비교100 : 음수 	| 1-100 = -99 (음)
		기준 100 비교100 : 0 	| 100-100 = 0 (0)
		기준 100 비교1 : 양수 	| 100-1 =99	  (양)
		
		*/
		
		
		//method
		
		public String getName() {
			return name;
		}
		@Override
		public String toString() {
			return "PersonDTO [name=" + name + ", age=" + age + "]";
		}
		
}














