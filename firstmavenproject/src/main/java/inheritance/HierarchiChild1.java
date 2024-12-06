package inheritance;

public class HierarchiChild1 extends HierarchiParent1{
	public void area()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("area of a rectangle:" +c);
	}

	public static void main(String[] args) {
		
		HierarchiChild1 obj=new HierarchiChild1();
		obj.display();
		obj.area();// TODO Auto-generated method stub

	}

}
