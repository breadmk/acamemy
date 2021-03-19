package KangMinGyu;


import java.util.List;


public class BoardListExample {

	public static void main(String[] args) {
		
		BoardDao bdao = new BoardDao();
				bdao.setBoardDto("java의 정석-가","홍자바");
				bdao.setBoardDto("java의 정석-나","김자바");
				bdao.setBoardDto("java의 정석-다","이자바");
			
//			Iterator<BoardDto> it = bdao.iterator(); 왜 Iterator는 생성이 안 될까요; 	
			
//			Iterator 생성이 안 되서 for문으로 출력; 
		List <BoardDto> list = bdao.getBoardDto();
				for(int i=0; i<list.size(); i++) {
				BoardDto obj = list.get(i);
				System.out.println(obj);
			}
				
	}

}
