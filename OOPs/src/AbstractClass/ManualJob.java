package AbstractClass;
//ManualJob - (Mô ph�?ng một công việc phổ thông)
//Lớp cha (AbstractJob) có 2 phương thức trừu tượng.
//Lớp này mới chỉ thực hiện 1 phương thức trừu tượng của lớp cha.
//Vì vậy nó bắt buộc phải khai báo là abstract.
public abstract class ManualJob extends AbstractJob {
	public ManualJob() {
		
	}

	@Override
	public String getJobName() {
		// TODO Auto-generated method stub
		return "Manual job";
	}

	
}
