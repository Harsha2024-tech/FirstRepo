package review;

public class MultiEg3 extends MultiEg2 {
	public void add()
	{
		int a=10;
		int b=30;
		int c=a+b;
		System.out.println("Addition result:" +c);
	}
	

	public static void main(String[] args) {
		MultiEg3 obj=new MultiEg3();
		obj.display();
		obj.details("Harsha", 27);
		obj.add();
		// TODO Auto-generated method stub

	}

}
