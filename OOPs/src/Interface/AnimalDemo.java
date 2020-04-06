package Interface;
import Interface.CanEat;
public class AnimalDemo {
	public static void main(String[] args) {
		// Thừa kế trường tĩnh từ interface CanDrink.
		System.out.println("Drink " + Cat.SEVEN_UP);
		
		// Khởi tạo một đối tượng CanEat.
        // Một đối tượng khai báo là CanEat.
        // Nhưng thực tế là Cat.
		CanEat canEat1 = new Cat("Tom");
		
		// Một đối tượng khai báo là CanEat.
        // Nhưng thực tế là Mouse.
		CanEat canEat2 = new Mouse();
		
		// Tính đa hình (Polymorphism) thể hiện rõ tại đây.
        // Java luôn biết một đối tượng là kiểu gì
        // ==> Tom cat eat ...
		canEat1.eat();
		
		// ==> Mouse eat ...
		canEat2.eat();
		boolean isCat = canEat1 instanceof Cat ;
		System.out.println("canEat1 is Cat ? " + isCat);
		
		// Ép kiểu (Cast).
		if(canEat1 instanceof Mouse) {
			Mouse mouse = (Mouse) canEat2;
			// Gọi phương thức drink (Thừa kế từ CanDrink).
			mouse.drink();
		}
	}
}
