package ThuaKeVaDaHinh;

public class Cat extends Animal {
	private int age;
	private int height;
	
	public Cat(int age , int height) {
		//Gọi đến constructor mặc định của lớp Animal.
		//Nhằm mục đích gán tạo giá trị cho các trường(Field) của lớp cha .
		super();
		//Sau đó mới gán các giá trị cho trường của nó .
		this.age = age;
		this.height = height;
	}
	public Cat(String name , int age , int height) {
		//Gọi đến constructor của lớp Animal.
		//Nhằm mục đích gán tạo giá trị cho các trường(Field) của lớp cha .
		super(name);
		//Sau đó mới gán các giá trị cho trường của nó .
		this.age = age;
		this.height = height;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String getAnimalName() {
		
		return "Cat";
	}
	
}
