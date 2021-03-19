package dap;

public class SchoolDTO {
	//field
	private int sno;
	private String loc;
	private String hp;
	private String grade;
	//constructor
	
	public SchoolDTO() {}
	public SchoolDTO(int sno,String loc,String hp, String grade) {
				this.sno=sno;
				this.loc=loc;
				this.hp=hp;
				this.grade=grade;
	}
	
	
	
	//method
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "SchoolDTO [sno=" + sno + ", loc=" + loc + ", hp=" + hp + ", grade=" + grade + "]";
	}

	
	


}
