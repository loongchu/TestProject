package AbstractClass;
//Lop nay thuc
public class JavaCoding extends AbstractJob {
	public JavaCoding() {
		
	}
	//Thuc hien phuong thuc truu tuong khai bao tai lop cha
	@Override
	public String getJobName() {		
		return "Coding Java";
	}

	@Override
	public void doJob() {
		// TODO Auto-generated method stub
		System.out.println("Coding Java ...");
	}
	
}
