package ch11;

import java.util.Vector;

//Vector
// capacity 의 기본값은 10이고 2배씩 증가한다. 하지만 초기값을 지정해주면 그 값을 2배씩 증가한다.
public class Vector01 {

	public static void main(String[] args) {
//			Vector(int initialCapacity,int capacityIncrement)
//			initialCapacity 가 채워지면 capacityIncrement씩 증가
		
			Vector vt2 = new Vector(20,2);	// (초기값,증가값);
			
			System.out.println("백터의 capacity()= "+vt2.capacity()); //20 || 초기용량 10
			System.out.println("백터의 size()= "+vt2.size()); //0
			System.out.println();
			
			//객체를 삽입
			for(int i=1; i<32; i++) {
				vt2.add("내용" +i ); 
			}
			System.out.println("백터의 capacity()= "+vt2.capacity()); //32 || 초기 용량은 2배씩 증가함.
			System.out.println("백터의 size()= "+vt2.size()); //31
			System.out.println();	
			
//			데이터 가져오기
			for(int i=0; i<vt2.size(); i++) {
				Object obj = vt2.get(i);
				System.out.println(obj);
			}
			
//			Vector(int initialCapacity)
//			Vector vt1 = new Vector(20);
//			System.out.println("백터의 capacity()= "+vt1.capacity()); //20 || 초기용량 10
//			System.out.println("백터의 size()= "+vt1.size()); //0
//			System.out.println();
//	
//			for(int i=1; i<31; i++) {
//				vt1.add("내용" +i ); 
//			}
//			System.out.println("백터의 capacity()= "+vt1.capacity()); //40 || 초기 용량은 2배씩 증가함.
//			System.out.println("백터의 size()= "+vt1.size()); //30
//			System.out.println();	
		
			System.out.println("-----------------------");
			Vector vt = new Vector();
			System.out.println("백터의 capacity()= "+vt.capacity()); //10 || 초기용량 10
			System.out.println("백터의 size()= "+vt.size()); //0
			System.out.println();
			
//			객체를 삽입
			for(int i=1; i<26; i++) {
				vt.add("제목1" +i ); 
//				25개의 객체가 삽입되면서 초기 capacity 10 -> 제목1...제목10 => size 10
//				초기 capacity를 채우고 2배로 증가되어서 capacity 10
//				초기 capacity 10을 채우고 2배로 증가되어서 capacity 20
			}
			
			System.out.println("백터의 capacity()= "+vt.capacity()); //40 || 초기 용량은 2배씩 증가함.
			System.out.println("백터의 size()= "+vt.size()); //25
			System.out.println();
			
			
	}

}
