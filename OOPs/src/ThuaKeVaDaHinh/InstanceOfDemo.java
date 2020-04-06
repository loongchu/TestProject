package ThuaKeVaDaHinh;
import ThuaKeVaDaHinh.Animal;
import ThuaKeVaDaHinh.Cat;
import ThuaKeVaDaHinh.Mouse;;

public class InstanceOfDemo {
	public static void main(String[] args) {
		//Đối tượng tom được gọi theo lớp Animal .
		Animal tom = new Cat("Tom",3,20);
		System.out.println("Name : " + tom.getName());
		System.out.println("Animal Name : "+ tom.getAnimalName());
	
		System.out.println();
		//Đối tượng tem được gọi theo lớp Cat .
		Cat tem = new Cat("Tem", 4, 17);
		System.out.println("Name : " + tem.getName());
		System.out.println("Animal Name : " + tem.getAnimalName());
		System.out.println("Age : " + tem.getAge());
		System.out.println("Height : " + tem.getHeight());
		System.out.println();
		
		//Sử dụng toán tử instanceof để kiểm tra xem một đối tượng 
		//có phải là 1 kiểu nào nó không .
		boolean isMouse = tom instanceof Mouse;
		System.out.println("Tom is mouse ?" + isMouse);
		
		boolean isCat = tom instanceof Cat;
		System.out.println("Tom is cat ?" + isCat);
		
		boolean isAnimal = tom instanceof Animal;
		System.out.println("Tom is animal ?" + isAnimal);
		
	}
}
