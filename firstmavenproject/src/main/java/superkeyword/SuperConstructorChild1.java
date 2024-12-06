package superkeyword;

public class SuperConstructorChild1 extends SuperConstructorParent1 {
	public SuperConstructorChild1()
	{
		super(10,20);
		System.out.println("HelloWorld");
	}
	public SuperConstructorChild1(int a,int b)
	{
		this();
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		SuperConstructorChild1 obj=new SuperConstructorChild1(20,10);
		
		
		// TODO Auto-generated method stub

	}

}
