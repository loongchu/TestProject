package Interface;

import Interface.CanDrink;
import Interface.CanEat;

//Lớp Cat mở rộng từ lớp Animal và thi hành 2 interface CanEat, CanDrink.
//Cat là lớp thông thường (Nó không được khai báo là trừu tượng).
//Vì vậy nó phải thực hiện mọi phương thức trừu tượng của các Interface.
public class Cat extends Animal implements CanEat, CanDrink {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	// Thực hiện phương thức của interface CanMove.
	@Override
	public void back() {
		// TODO Auto-generated method stub
		System.out.println(name + "cat back ..");
	}

	// Thực hiện phương thức của interface CanMove.
	@Override
	public int getVelocity() {
		// TODO Auto-generated method stub
		return 110;
	}

	// Thực hiện phương thức của interface CanDrink.

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println(name + "cat drink ..");
	}

	// Thực hiện phương thức của interface CanEat.
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name + "cat eat ..");
	}

}
