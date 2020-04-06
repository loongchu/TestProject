package LopVaDoiTuong;

public class Demo {
	public static void main(String[] args) {
		Person Loong = new Person("Long Chu", 21, "Ha Noi"); // PHUONG THUC KHOI TAO
		
		napChong(5);
		napChong(1.1);
		System.out.println(Loong.getAddress() + " " + Loong.getAge() + " " + Loong.getName());
		
		Person ksh = new Person();
		ksh.inSert();
		System.out.println(ksh.getName());
	}

	public static void napChong(int a) {
		System.out.println(a);
	}

	public static void napChong(double b) {
		System.out.println(b + 10);
	}

}
