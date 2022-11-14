package hafta7;

public class Test {

	public static void main(String[] args) {
		Communitymember c=new Communitymember("Ahmet","Mehmet","05054949494");
		System.out.println(c.getAdi()+" "+c.getSoyadi()+" ");
		c.giris();
		AkademikPersonel a=new AkademikPersonel("Ali","Veli","05352542161","Doc. Dr.");
		System.out.println(a.getUnvan()+" "+a.getAdi()+" "+a.getSoyadi()+" ");
		a.giris();/*
		AkademikPersonel a1=new AkademikPersonel("Hasan","Huseyin","05352542151","Prof. Dr.");
		System.out.println(a1.getUnvan()+" "+a1.getAdi()+" "+a1.getSoyadi()+" ");
		a1.giris();*/
		
		Student s=new Student("Leyla","Mecnun","545","12345");
		System.out.print(s.getStudentid()+" numarali "+s.getAdi()+" "+s.getSoyadi()+" ");
		s.giris();
		System.out.println(a.getUnvan());
	}

}
