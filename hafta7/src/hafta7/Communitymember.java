package hafta7;

public class Communitymember {
	protected String Adi,Soyadi;
	protected String Tel;
	public Communitymember(String adi, String soyadi, String tel) {
		super();
		Adi = adi;
		Soyadi = soyadi;
		Tel = tel;
	}
	public void giris() {
		System.out.println(" Giris Yapti");
		
	}
	public String getAdi() {
		return Adi;
	}
	public void setAdi(String adi) {
		Adi = adi;
	}
	public String getSoyadi() {
		return Soyadi;
	}
	public void setSoyadi(String soyadi) {
		Soyadi = soyadi;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	

}
