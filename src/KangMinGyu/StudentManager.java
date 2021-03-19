package KangMinGyu;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentManager {
		static Scanner sc = new Scanner(System.in);
		static Map map = new HashMap();
	public static void main(String[] args) {
		
//		List,Set,Map 여러가지를 다 시도해 봤는데 뭐가 가장 어울리는지 아직 잘 모르는 것 같아요.
//		전체 입력후 전체 출력은 List가 편하고 읽어오는 부분에서 equals 를 활용했으나 계속 막혀서 map으로 생성했습니다.
//		Map으로 만들다 보니 입력시에 띄어쓰기로 해야 key가 잡히는 부분이 불편합니다.
		System.out.println("4명의 학생이름(띄어쓰기로 입력하세요)|학과|학번|학점평균 형식으로 입력하세요.");
		System.out.print("학생1>>");
		map.put(sc.next(),sc.nextLine());
		System.out.print("학생2>>");
		map.put(sc.next(),sc.nextLine());
		System.out.print("학생3>>");
		map.put(sc.next(),sc.nextLine());
		System.out.print("학생4>>");
		map.put(sc.next(),sc.nextLine());
		
		System.out.println(map.keySet());
//		
		System.out.println("학생 이름 >>");
				findStudent();
//			출력을 위해 map을 list로 바꾸고 싶은데 set으로 밖에 변환이 안 되는것 같아요.
			Set set = map.entrySet();
			Iterator it = set.iterator();	
//			value가 한 단위로 묶여서 숙제에 있는 것처럼 출력하려면 List로 작성해야될것 같은데, 또 아래 findStudent를 출력하려면 
//			머린속으론 무슨 소리인줄 알겠는데 코드 작성이 안 되는것 같아요.
			while(it.hasNext()){
				System.out.println("--------------");
				Map.Entry st = (Map.Entry) it.next();	// 자바의정석 기초편 예제 11-17을 참고해서 작성했는데 Map.Entry 가 정확히 어떻게 작용하는지 모르겠습니다.
				System.out.println("이름: "+st.getKey()+"\n"+"(학과|학번|학점평균)\n"+st.getValue());
				System.out.println("-------------");
			}
		}
	private static boolean findStudent() {
			String st = sc.next();
		if(!st.equals(map.keySet())) {
			System.out.println(st+map.get(st));
		}
		return false;
		}
		
	}
