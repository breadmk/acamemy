package ch11;

import java.util.TreeSet;

public class TreeSet01 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		
		ts.add(new Integer(95));
		ts.add(new Integer(64));
		ts.add(new Integer(1));
		ts.add(new Integer(10));
		ts.add(new Integer(58));
		System.out.println(ts);
		Integer num = null;
		Integer num1 = null;
		Integer num2 = null;
		Integer num3 = null;
		System.out.println("first라는것은 가장 낮은 점수 = "+ts.first());	//1
		System.out.println("last라는 것은 가장 높은 = "+ts.last());	//95
		
		
		num = ts.lower(new Integer(20));
		num1 = ts.higher(new Integer(20));
		num2 = ts.floor(new Integer(65));
		num3 = ts.ceiling(new Integer(65));
		System.out.println("20보다 한 단계 작은 숫자 = "+num);  //10
		System.out.println("20보다 한 단계 높은 숫자 = "+num1); //58
		System.out.println("65와 동일하거나 바로 아래 점수 = "+num2); //64
		System.out.println("65와 동일하거나 바로 위 점수 = "+num3); //95
		
		while(!ts.isEmpty()) {
			num = ts.pollFirst(); 		//가장 낮은애를 꺼내고 제거.
			System.out.println(num+"\t(남은객체수:"+ ts.size()+")");
		}
		System.out.println(ts);
	}
}


















