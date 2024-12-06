package abstraction;

public class AbstractEg2 extends AbstractEg1 {
	public void multi(int a, int b)
	{
		int c=a*b;
		System.out.println("Multiplication:"+c);
	}

	public static void main(String[] args) {
		AbstractEg2 obj=new AbstractEg2();
		obj.add(10, 20);
		obj.multi(10, 20);
		obj.sub(50,40);
		
		// TODO Auto-generated method stub

	}

	@Override
	public void sub(int a,int b) {
		
		int c=a-b;
		System.out.println("Substraction:"+c);
		// TODO Auto-generated method stub
		
	}

}
