package tan.dev;

public class Bird extends Animal implements Flyable {

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Chim thi an sau");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Chim bay tren troi");
	}

}
