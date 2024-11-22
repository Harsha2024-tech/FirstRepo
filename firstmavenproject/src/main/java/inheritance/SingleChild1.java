package inheritance;

public class SingleChild1 extends SingleParent1 {
	public void display()
	{
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		
		SingleChild1 obj=new SingleChild1();
		obj.display();
		obj.sample();
		// TODO Auto-generated method stub

	}

}
