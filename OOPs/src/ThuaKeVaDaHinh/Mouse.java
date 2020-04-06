package ThuaKeVaDaHinh;

public class Mouse extends Animal {
	private int weight ;
	
	//constructor mac dinh
	public Mouse() {
		//Goi toi cau tu Mouse(int)
		this(100);
	}
	
	//constructor co 1 tham so
	public Mouse(int weight) {
		//Neu ban khong goi bat ki super(..) nao
		//Java se goi 1 super() mac dinh
		//super()
		this.weight = weight;
	}
	
	//constructor co 2 tham so
	public Mouse(String name , int weight) {
		super(name);
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getAnimalName() {
		return "Mouse";
	}
	
}
