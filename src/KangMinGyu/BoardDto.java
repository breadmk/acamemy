package KangMinGyu;


public class BoardDto {
	//field
	private String title;
	private String content;
	
	
	public BoardDto() {}
	public BoardDto(String title, String content) {
		this.title = title;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "BoardDto [title=" + title + ", content=" + content + "]";
	}
	
	

}
	
	
	