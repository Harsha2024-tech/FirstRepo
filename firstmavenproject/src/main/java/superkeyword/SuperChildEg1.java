package superkeyword;

public class SuperChildEg1 extends ConstructorEg1 {
	public SuperChildEg1()
	{
		super();
		System.out.println("Child");
	}
public void details()
{
	super.display();
	System.out.println("Name is:"+super.name+" "+"rollnumber is:"+super.rollno);
}
	public static void main(String[] args) {
		SuperChildEg1 obj=new SuperChildEg1();
		obj.details();
		// TODO Auto-generated method stub

	}

}
