package tan.dev;

public class Car extends Machine implements Runable {

	@Override
	void fuel() {
		// TODO Auto-generated method stub
		System.out.println("Xe chay bang xang");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Xe chay tren duong");
	}

}
