package abstraction;

public class AbEg2 extends AbEg1 {

	public static void main(String[] args) {
		AbEg2 obj=new AbEg2();
		obj.add();
		// TODO Auto-generated method stub

	}

	@Override
	public void add() {
		int a=10;
		int b=30;
		int c=a+b;
		System.out.println("Addition result:"+c);
		// TODO Auto-generated method stub
		
	}

}
