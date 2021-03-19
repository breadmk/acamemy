package KangMinGyu;


public class CompanyDTO {
	private int cNo;	
	private String cName;
	private String ceo;	
	private String tel;	
	private String dam;
	
	public CompanyDTO() {}
	
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDam() {
		return dam;
	}
	public void setDam(String dam) {
		this.dam = dam;
	}
	@Override
	public String toString() {
		return "CompanyDTO [cNo=" + cNo + ", cName=" + cName + ", ceo=" + ceo + ", tel=" + tel + ", dam=" + dam + "]";
	}	
	
	
	
	
}
