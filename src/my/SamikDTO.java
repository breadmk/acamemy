package my;

public class SamikDTO {

//	field
	private int dong;
	private int ho;
	private String owner;
	private String hp;
	private String car;
//	constructor
	public SamikDTO() {}
	public SamikDTO(int dong,int ho, String owner,String hp, String car) {
		this.dong=dong;
		this.ho=ho;
		this.owner=owner;
		this.hp=hp;
		this.car=car;
	}
	
	
//	method
	
	
	public int getDong() {
		return dong;
	}
	public void setDong(int dong) {
		this.dong = dong;
	}
	public int getHo() {
		return ho;
	}
	public void setHo(int ho) {
		this.ho = ho;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "SamikDTO [dong=" + dong + ", ho=" + ho + ", owner=" + owner + ", hp=" + hp + ", car=" + car + "]";
	}
	
	
}
