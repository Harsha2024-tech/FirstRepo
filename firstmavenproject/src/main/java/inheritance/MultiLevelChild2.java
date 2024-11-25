package inheritance;

public class MultiLevelChild2 extends MultiLevelChild1 {
	public void multi()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("Multiplication Result:" +c);
	}

	public static void main(String[] args) {
		MultiLevelChild2 obj=new MultiLevelChild2();
		obj.multi();
		obj.add();
		obj.display();
		// TODO Auto-generated method stub

	}

}
