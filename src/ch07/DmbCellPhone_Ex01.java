package ch07;

//DmbCellPhone01 클래스를 사용하는 실행클래스
public class DmbCellPhone_Ex01 {
	public static void main(String[] args) {
		//객체만들기
		DmbCellPhone01 dmb = new DmbCellPhone01("자바폰", "hotpink", 100);
//		필드출력
		System.out.println("model="+dmb.model);
		System.out.println("color="+dmb.color);
		//DmbCellPhone01 클래스에서 선언한 필드값 출력
		System.out.println("channel="+dmb.channel);
		
		//전원키고
		dmb.powerOn();
		//벨소리점검
		dmb.bell();
		//여보세요~~거기 누구 없소? 물어보기
		dmb.sendVoice("여보세요~~거기 누구없소");
		//네 ~ 대답듣기
		dmb.receiveVoice("네~");
		//dmb겨기
		dmb.turnOnDmb();
		//채널변경
		dmb.changeChannelDmb(200);
		//dmb끄기
		dmb.turnOffDmb();
	}
}
