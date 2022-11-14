package hafta7;

public class AkademikPersonel extends Communitymember {
	protected String unvan;

	public AkademikPersonel(String adi, String soyadi, String tel, String unvan) {
		super(adi, soyadi, tel);
		this.unvan = unvan;
	}
	public void giris() {
		System.out.println("Guney Kapisindan Giris Yapti");
		
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	

}
