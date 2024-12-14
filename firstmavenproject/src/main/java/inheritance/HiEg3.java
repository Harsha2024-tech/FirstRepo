package inheritance;

public class HiEg3 extends HiEg1 {
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition result:"+c);
	}

	public static void main(String[] args) {
		HiEg3 obj=new HiEg3();
		obj.display();
		obj.add();
		// TODO Auto-generated method stub

	}

}
