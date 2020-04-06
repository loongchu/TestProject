package ThuaKeVaDaHinh;

public class PersonDemo {
	// Trường name - thông tin tên người .
	private String name;
	//Trường bornYear - thông tin năm sinh .
	private Integer bornYear;
	//Trường placeOfBirth - thông tin nơi sinh .
	private String placeOfBirth;
	
	//Constructor gồm 3 tham số .
	//Mục đích nhằm để gán các giá trị cho các trường của PersonDemo .
	//Chỉ định rõ tên , năm sinh , nơi sinh của một người .
	public PersonDemo(String name, Integer bornYear, String placeOfBirth) {
		this.name = name;
		this.bornYear = bornYear;
		this.placeOfBirth = placeOfBirth;
	}

	//Constructor có 1 tham số .
	//Mục đích gán các giá trị cho 2 trường tên và năm sinh cho PersonDemo .
	//Nơi sinh không được gán.
	public PersonDemo(String name, Integer bornYear) {
		this.name = name;
		this.bornYear = bornYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBornYear() {
		return bornYear;
	}

	public void setBornYear(Integer bornYear) {
		this.bornYear = bornYear;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	
	
	
	
	
	
	
}
