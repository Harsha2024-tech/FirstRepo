package inheritance;

public class HiearchiChild2 extends HierarchiParent1 {
	public void perimeter()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("perimeter of rectangle:" +c);
	}
	

	public static void main(String[] args) {
		HiearchiChild2 obj=new HiearchiChild2();
		obj.display();
		obj.perimeter();
		


	}

}
