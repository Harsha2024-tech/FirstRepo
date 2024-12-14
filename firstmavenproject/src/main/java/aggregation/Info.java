package aggregation;

public class Info {
	Stud ref;
	public Info(Stud ref)
	{
		this.ref=ref;
	}
	public void display()
	{
		System.out.println("Name:"+ref.name+" " +"age:"+ref.age);
	}

	public static void main(String[] args) {
		Stud obj=new Stud();
		Info obj1=new Info(obj);
		obj.details("Harsha", 27);
		obj1.display();
		
		
		// TODO Auto-generated method stub

	}

}
