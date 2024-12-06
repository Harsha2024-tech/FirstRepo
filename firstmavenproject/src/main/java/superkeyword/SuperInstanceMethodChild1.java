package superkeyword;

public class SuperInstanceMethodChild1 extends SuperInstanceMethodParent1 {
	public void sample()
	{
		System.out.println("child class");
		super.display();
	}

	public static void main(String[] args) {
		SuperInstanceMethodChild1 obj=new SuperInstanceMethodChild1();
		obj.sample();
		// TODO Auto-generated method stub

	}

}
