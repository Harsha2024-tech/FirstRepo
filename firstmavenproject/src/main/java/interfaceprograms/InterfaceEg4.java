package interfaceprograms;

public class InterfaceEg4 implements InterfaceEg3  {
	public void display2()
	{
		System.out.println("hi");
	}

	public static void main(String[] args) {
		InterfaceEg4 obj=new InterfaceEg4();
		obj.display1();
		obj.display2();
		// TODO Auto-generated method stub

	}

	@Override
	public void display1() {
		System.out.println("java");
		// TODO Auto-generated method stub
		
	}

}
