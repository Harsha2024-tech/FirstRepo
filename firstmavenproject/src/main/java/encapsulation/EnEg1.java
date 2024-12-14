package encapsulation;

public class EnEg1 {
	private String name;
	private int age;
	public void setdetails(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void getdeails()
	{
		System.out.println("name:"+name);
		System.out.println("age:" +age);
	}

}
