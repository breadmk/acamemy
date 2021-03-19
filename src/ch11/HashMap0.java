package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap0 {

	public static void main(String[] args) {
//		1)Map생성
		Map<String,Integer> map = new HashMap<String,Integer>();
//		Map map = new HashMap();
		
//		2)객체저장 (key중복불가,value는 중복가능)
		map.put("hong", 10); //key는 중복을 허용하지 않으므로 객체저장X
		map.put("gil", 50);
		map.put("dong", 100);
		map.put("hong1", 100); //value는 중복허용하므로 객체저장
		map.put("hong", 1234); 	//먼저 있는걸 지워버리고 마지막에 추가된 부분이 저장됨.
		System.out.println("총 객체 수 = " + map.size()); //4
//		3)특정객체조회 - 조회 : Object get(key)
		Integer x =map.get("hong");		//원칙
		System.out.println("Integer x ="+x);//1234
		System.out.println((x.MAX_VALUE)); //2147483647
		
//		map.get("hong") 여기에서는 Integer로 리턴받지만 
//		int 타입의 변수에 저장할 수 있는 이유는 auto unboxing이 되기 때문이다.
		
		int y = map.get("hong");		//그냥 기본형타입.
		System.out.println("Integer y ="+y);//1234
		System.out.println();
//		4)Map에 저장된 모든 객체 조회
//		value를 가져오기 위해서는 먼저 key를 알아야 한다.
//		keySet() : 모든 키를 Set컬렉션으로 받을 수 있다.
//		keySet()을 이용해서 Set컬렉션으로 받고 Set컬렉션에서 제공되는 
//		 반복자를 통해 모든 key를 얻은 다음 받은 개별 key를 이용해서 get()을 통해 값을 얻는다. 
		  
		Set<String> keys = map.keySet();// keySet() : 모든 키를 Set컬렉션으로 받을 수 있다. 
										// Set의 타입은 제네릭스를 따라간다.
		Iterator<String>  iter = keys.iterator(); //Set컬렉션에서 제공되는 반복자 얻기
		while(iter.hasNext()) {
			String key = iter.next();		// 받은 개별 key를 이용해서 
			Integer value = map.get(key);	// get()을 통해 값을 얻는다. 
//			System.out.println(key+" : "+value);
			System.out.printf("%s:%d\n",key,value);
		}							
		
		
//		5)특정객체를 제거
		System.out.println();
		map.remove("hong");
		System.out.println("특정 객체 제거후의 총 객체 수 = " + map.size()); //3
		System.out.println();
//		전체 객체를 출력 ( 다른 방법 ) 
//		set<Entry<String,Integer>> entrySet()
//		set						   entrySet()
		Set<Entry<String,Integer>> set = map.entrySet(); //entrySet()을 통해 
		Iterator<Entry<String,Integer>> iter1 = set.iterator();	//Set 컬렉션에서 제공되는 반복자를 통해  Map.Entry를 하나씩 얻고
		while(iter1.hasNext()) {
			Entry<String,Integer> entry = iter1.next(); //getKey()를 통해 key를 
			String key = entry.getKey(); //getValue()를 통해 value를 얻기
			Integer value = entry.getValue();
			System.out.printf("%s:%d\n",key,value);
		}


		
		map.entrySet();
		
		
	}

}



