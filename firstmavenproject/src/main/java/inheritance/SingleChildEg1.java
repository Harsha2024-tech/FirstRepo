package inheritance;

public class SingleChildEg1 extends SingleParentEg1 {
	public void details()
	{
		System.out.println("Single Inheritance child");
	}

	public static void main(String[] args) {
		SingleChildEg1 obj=new SingleChildEg1();
		obj.display();
		obj.details();
		// TODO Auto-generated method stub

	}

}
