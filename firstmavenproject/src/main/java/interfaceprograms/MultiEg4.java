package interfaceprograms;

public class MultiEg4 implements MultiEg1,MultiEg3 {

	public static void main(String[] args) {
		MultiEg4 obj=new MultiEg4();
		int x=obj.add(10, 100);
		System.out.println(x);
		obj.sub(60, 40);
		// TODO Auto-generated method stub

	}

	@Override
	public void sub(int a, int b) {
		int c=a-b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public int add(int a, int b) {
		int c=a+b;
	
		// TODO Auto-generated method stub
		return c;
	}

}
