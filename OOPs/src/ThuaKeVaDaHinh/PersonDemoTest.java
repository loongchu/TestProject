package ThuaKeVaDaHinh;

public class PersonDemoTest {
	public static void main(String[] args) {
		//Đối tượng : Long Chu .
		PersonDemo Long = new PersonDemo("Chu Việt Long", 1999);
		
		System.out.println("Info");
		System.out.println("Name : "+ Long.getName());
		System.out.println("Born Year : "+ Long.getBornYear());
		System.out.println("Place Of Birth: "+ Long.getPlaceOfBirth());
		
		System.out.println();
		//Đối tượng LongChu .
		PersonDemo LongChu = new PersonDemo("Long Chu", 1999, "Hà Nam");
		
		System.out.println("Info");
		System.out.println("Name : " + LongChu.getName());
		System.out.println("Born Year : " + LongChu.getBornYear());
		System.out.println("Place Of Birth : "+ LongChu.getPlaceOfBirth());
		
	}
}
