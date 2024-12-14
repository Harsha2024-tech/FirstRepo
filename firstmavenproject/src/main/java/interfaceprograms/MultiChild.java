package interfaceprograms;

public class MultiChild implements MultiParent,MultiParent2 {
	public void info()
	{
		System.out.println("red");
	}

	public static void main(String[] args) {
		MultiChild obj=new MultiChild();
		obj.details();
		obj.display();
		obj.info();
		// TODO Auto-generated method stub

	}

	@Override
	public void details() {
		System.out.println("Hello");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("java");
		// TODO Auto-generated method stub
		
	}

}
