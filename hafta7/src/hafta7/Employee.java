package hafta7;

public class Employee extends Communitymember {
	protected String departman;

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public Employee(String adi, String soyadi, String tel, String departman) {
		super(adi, soyadi, tel);
		this.departman = departman;
	}

}
