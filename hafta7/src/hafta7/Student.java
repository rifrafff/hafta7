package hafta7;

public class Student extends Communitymember{
	protected String Studentid;

	public String getStudentid() {
		return Studentid;
	}

	public void setStudentid(String studentid) {
		Studentid = studentid;
	}

	public Student(String adi, String soyadi, String tel, String studentid) {
		super(adi, soyadi, tel);
		Studentid = studentid;
	}
	

}
