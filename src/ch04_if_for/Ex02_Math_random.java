package ch04_if_for;

// 조건문
/* 90점 이상이면 - A등급
/* 80점 이상이면 - B등급
/* 70점 이상이면 - C등급
/* 60점 이상이면 - D등급
/* 60점 미만이면 - F	출력
 */
public class Ex02_Math_random {
	/* Math.random() : 0.0 이상 1.0 미만의 난수를 무작위로 생성.
	 Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. 
	 */
	public static void main(String[] args) {
		double num = Math.random();//0.0 이상(greater than or equals to) 1.0 미만(less than)의 양수(positive)값을 준다.
		System.out.println("Math.random()="+num);
		System.out.println("(int)Math.random()="+(int)num);
		//0~5
		//0~100
		//Math.random()*(큰수-작은수+1)+작은수
		//(int)(Math.random()*(큰수-작은수+1)+작은수)  ---------전체에 대한 강제 형변환을 해줘야함.
		System.out.println((int)(Math.random()*(5-0+1)+0));
		System.out.println((int)(Math.random()*(100-0+1)+0));
		
		
		int score = (int)(Math.random()*(100-0+1)+0);		// 임의의 점수값을 저장하기 위한 변수.
		String grade="";	// 등급을 저장하기 위한 변수.
		
		if(score>=90) {
			grade="A";
		}else if(score>=80) {
			grade="B";
		}else if(score>=70) {
			grade="C";
		}else if(score>=60) {
			grade="D";
		}else{
			grade="F";
		}	
		System.out.println(score+"점:"+grade+"등급");
	}

}
