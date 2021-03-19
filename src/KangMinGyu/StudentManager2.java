package KangMinGyu;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class StudentManager2 extends StudentDTO{
		static Scanner sc = new Scanner(System.in);
		static ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
	public static void main(String[] args) {
		for(int i=1; i<5; i++) {
			
		System.out.println(i+"번째의 학생이름,학과,학번,학점평균 형식으로 입력하세요.");
		System.out.print("학생"+i+"이름>>");
		String name = sc.nextLine();
		System.out.print("학생"+i+"학과>>");
		String department = sc.nextLine();
		System.out.print("학생"+i+"학번>>");
		String id = sc.nextLine();
		System.out.print("학생"+i+"학점평균>>");
		double grade = Double.parseDouble(sc.nextLine());
		StudentDTO st = new StudentDTO(name,department,id,grade);
		
			
			list.add(st);
			
		}	
		System.out.println("학생 이름 >>");
			findStudent();
		
	}
	
	private static void findStudent() {
		String st = sc.nextLine();
	if(!st.equals(sc.nextLine())) {
		Object obj = list.get(st);
		System.out.println(obj);
	}
	return;
	}
	}
		
		Iterator iter = list.iterator();
	
		
		
		
		
		
		
		
		
		
		
//	static void findStudent() {
//		System.out.println("학생 이름 >>");
//		String name = sc.nextLine();
//		 for(int i=0; i<list.size();i++) {
//			 StudentDTO st = new StudentDTO();
//		 if(name.equals(st.getName())) {
//			 Iterator iter = list.iterator();
//			 while(iter.hasNext()) {
//				 System.out.println(iter.next());
			 }
//		 }
//}
//	}
//}












