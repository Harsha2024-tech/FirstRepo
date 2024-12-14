package interfaceprograms;

public class InterEg2 implements Inter1 {
	public void details()
	{
		System.out.println("grren");
	}

	public static void main(String[] args) {
		InterEg2 obj=new InterEg2();
		obj.display();
		obj.details();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("java");
		// TODO Auto-generated method stub
		
	}

}
