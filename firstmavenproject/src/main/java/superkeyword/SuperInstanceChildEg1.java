package superkeyword;

public class SuperInstanceChildEg1 extends SuperInstanceEg1 {
	String color="Green";
	public void display()
	{
		System.out.println("child class color:" +color);
		System.out.println(super.Color);
	}

	public static void main(String[] args) {
		SuperInstanceChildEg1 obj=new SuperInstanceChildEg1();
		obj.display();		// TODO Auto-generated method stub

	}

}
