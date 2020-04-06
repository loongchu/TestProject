package AbstractClass;
//Class này thừa kế từ class trìu tượng ManualJob 
//BuildHouse không được khai báo là trừu tượng.
//Vì vậy nó cần thực hiện tất cả các phương thức trừu tượng còn lại.
public class BuildHouse extends ManualJob {
	public BuildHouse() {
		
	}

	@Override
	public void doJob() {
		// TODO Auto-generated method stub
		System.out.println("Building House");
	}
}
