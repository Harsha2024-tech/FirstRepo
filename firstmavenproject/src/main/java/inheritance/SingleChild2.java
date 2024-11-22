package inheritance;

public class SingleChild2 extends SingleParent2 {

	public void sub()
	{
		int a=10;
		int b=20;
		int c=b-a;
		System.out.println("substraction result:" +c);
	}
	public static void main(String[] args) {
		SingleChild2 obj=new SingleChild2();
		obj.add();
		obj.sub();
		// TODO Auto-generated method stub

	}

}
