package tan.dev;

public class Dog extends Animal implements Runable {

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cho se an xuong");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Cho chay tren bo");
	}

}