package polymorphism;

public class PolyChild1 extends PolyParent1 {
	public void display()
	{
		super.display();
		System.out.println("World");
	}

	public static void main(String[] args) {
		PolyChild1 obj=new PolyChild1();
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
