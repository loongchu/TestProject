package static_fileds_and_methods;

public class static2 {
	private String something = "Something" ;
	private static String someth = "Otherthing" ;
	public static void main(String[] args) {
		System.out.println(someth);

		doOtherShow(150);
	}
	public void show(int n ) {
		System.out.println("N = "+ n);
	}
	public static void doOtherShow(int n) {
		System.out.println("N = "+ n);
	}
}
// PHAI LA CAC PHUONG THUC STATIC VOI GOI DEN NHAU DUOC 