package encapsulation;

public class EncapEg1 {
	private int age;
	private String name;
	public void setdetails(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public void getdetails()
	{
		System.out.println("Name:" +name+" " +"Age"+ age);
	}

}
