package accessmodifier;

public class AccessModifierEg1 {
	public void display1()
	{
		System.out.println("This is a public acess modifier");
	}
	private void display2()
	{
		System.out.println("This is private access modifier");
	}
	protected void display3()
	{
		System.out.println("This is a protected access modifier");
	}
	void display4()
	{
		System.out.println("This is a default access modifier");
	}
	public static void main(String[] args) {
		AccessModifierEg1 obj=new AccessModifierEg1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
		
		// TODO Auto-generated method stub

	}

}
