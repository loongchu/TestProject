package Interface;
import Interface.CanDrink;
import Interface.CanEat;
public class Mouse extends Animal implements CanEat,CanDrink {
	
	@Override
	public void back() {
		// TODO Auto-generated method stub
		System.out.println("Mouse back ..");
	}

	@Override
	public int getVelocity() {
		// TODO Auto-generated method stub
		return 80;
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Mouse drink.. ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mouse eat ..");
	}

}
