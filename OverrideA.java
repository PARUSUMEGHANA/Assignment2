package overidepract;

class A {
	public void show() {
		System.out.println("in A");
	}
}

class B extends A {


	@Override
	public void show() {
		super.show();
		System.out.println("in B");

	}
}

public class OverrideA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.show();

	}

}
