package inheritance;

public class MultiLevelEg3 extends MultiLevelEg2 {
	public int multi()
	{
		int a=5;
		int b=6;
		int c=a*b;
		return c;
	}

	public static void main(String[] args) {
		MultiLevelEg3 obj=new MultiLevelEg3();
		obj.add();
		obj.sub(60, 40);
		int x=obj.multi();
		System.out.println("Multiplication Result:" +x);
		// TODO Auto-generated method stub

	}

}
