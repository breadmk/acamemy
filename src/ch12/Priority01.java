package ch12;

public class Priority01 {

	public static void main(String[] args) {
		
		MinThread min = new MinThread("         그닥");
		MaxThread max = new MaxThread("훨씬");

//		쓰레드에 우선순위 지정
		
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		min.start();
		max.start();
		
		System.out.println("-메일쓰레드의 끝-");
		
	}

}

// 덜 중요한 클래스라고 가정.
class MinThread extends Thread{
	public MinThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(currentThread().getName()+i);
		}

	}
	
}

//더 중요한 클래스라고 가정.
class MaxThread extends Thread{
	public MaxThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(currentThread().getName()+i);
		}

	}
	
}


