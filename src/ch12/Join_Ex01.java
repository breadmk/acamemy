package ch12;

import java.util.ArrayList;

// join()
// 쓰레드를 여러개 동시에 실행할 때는 
// 어떤 쓰레드가 실핼될지 정확히 제어하지 힘들다.
// 따라서 특정한 쓰레드가 전부 실행된 후에 다른 쓰레드가 실행되게 하려면 일정한 처리를 해야한다.
// 이럴 때 사용하는 메서드가 join().
// join() : join() 메서드를 호출한 쓰레드 작업이 모두 끝날때까지 다른 쓰레드가 대기하는 기능을 제공.

// 이 예제에서는 객체 2개를 생성후 동시에 실행     
// join을 적용하지 않은 멀티 쓰레드
public class Join_Ex01 {
	public static ArrayList<String> carList = new ArrayList<String>();
	    
	public static void main(String[] args) {
		
		BeforeThread bt = new BeforeThread("before");
		AfterThread at = new AfterThread("after");
		
		
		bt.start();
		at.start();
		
	}
}
   
// 목록에 자동차명의 추가
class BeforeThread extends Thread {

	public BeforeThread(String name) {
		super(name);
	}
	
	private void addCar() {
		System.out.println("addCar() 진입");
		Join_Ex01.carList.add("차1");
		Join_Ex01.carList.add("자동차2");
		Join_Ex01.carList.add("자동차3");
		Join_Ex01.carList.add("자동차4");
		Join_Ex01.carList.add("자동차5");
		
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName()+"run()호출성공");
		try {
			sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		addCar();
	}                
	
}

//------------↑before ↓after------------------- 

// 목록 출력
class AfterThread extends Thread {

	public AfterThread(String name) {
		super(name);   
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName()+"의  run()호출성공");
		for( int i=0 ; i<Join_Ex01.carList.size()  ; i++ ){
		       System.out.println( Join_Ex01.carList.get(i) ); //자동차목록 출력
		}
	}
}



