package refactoring.ex03.after;

//리팩토링 기준 : 메서드 추출.
//문제 : 하나의 method가 너무 길다. 
//방법 : 기존의 method엣허 묶을 수 있는 코드를 추출해서 별도의 메서드를 작성.
//단점 : method의 개수가 증가, 각 메서드의 길이는 짧아진다.
//주의 : 오버라이딩 메서드는 제외. run(){}

// 단계 1) 새로운 메서드에 적당한 이름 붙이기. 동사+명사형식, 무엇을 하느냐? 가 표현.
//   1-2) 기존 메서드에서 새로운 메서드로 코드복사
//   1-3) 메서드 내부의 지역 변수 검토
//   1-4) 메서드 매개변수 검토
//   1-5) 메서드 리턴유형(값) 검토

public class Banner {
    private final String _content;
    public Banner(String content) {
        _content = content;
    }
    
    public void print(int times) {
        // 테두리 출력
    	printBorderFrame();			//테두리출력
    	printContent(times);		//내용 출
        printBorderFrame();			//테두리출력
    }
    
    public void printContent(int times) {
    	for (int i = 0; i < times; i++) {
            System.out.println("|" + _content + "|");
        }
    	
    }
    
 // 단계 1) 새로운 메서드에 적당한 이름 붙이기. 동사+명사형식, 무엇을 하느냐? 가 표현.
//      1-3) 메서드 내부의 지역 변수 검토
//      1-4) 메서드 매개변수 검토
    public void printBorderFrame() {
//      1-2) 기존 메서드에서 새로운 메서드로 코드복사
    	System.out.print("+");
        for (int i = 0; i < _content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
//      1-5) 메서드 리턴유형(값) 검토
    }
}
