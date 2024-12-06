package abstraction;

public class AbstractionEg2 extends AbstractionEg1 {
	public void display1()
	{
		System.out.println("this is not an abstract method");
	}

	public static void main(String[] args) {
		AbstractionEg2 obj=new AbstractionEg2();
		obj.add();
		obj.display();
		obj.display1();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("This is a abstract method");
		// TODO Auto-generated method stub
		
	}

}
