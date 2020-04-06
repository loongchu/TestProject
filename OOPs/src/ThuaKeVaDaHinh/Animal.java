package ThuaKeVaDaHinh;
//Lớp có ít nhất 1 phương thức trừu tượng .
//Bắt buộc phải khai báo là trừu tượng .
public abstract class Animal {
	//Tên , mèo , chuột , vịt .
	private String name ;

	//Constructor mặc định .
	public Animal() {
		//Gán giá trị mặc định cho "name".
		this.name = this.getAnimalName();
	}
	public Animal(String name) {
		this.name = name;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Đây là 1 phương thức trừu tượng .
	//Trả về tên của loài động vật này .
	//Nội dung cụ thể của phương thức này .
	//Sẽ được thực hiện (implemented) tại các lớp con .
	public abstract String getAnimalName();
}
