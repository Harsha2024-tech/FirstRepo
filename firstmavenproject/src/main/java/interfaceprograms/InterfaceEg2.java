package interfaceprograms;

public class InterfaceEg2 implements InterfaceEg1 {
	public void add()
	{
		int a=10;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		InterfaceEg2 obj=new InterfaceEg2();
		obj.display();
		obj.add();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("Hai");
		// TODO Auto-generated method stub
		
	}

}
