package tan.dev;

public class Fish extends Animal implements Swimable {

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Ca se an rong reu");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Ca boi duoi nuoc");
	}

}