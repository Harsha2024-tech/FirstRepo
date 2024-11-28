package aggregation;

public class BookDetails {
	String bookname;
	int id;
	AutherDetail ref;
	public BookDetails(String bookname, int id, AutherDetail ref)
	{
		this.bookname=bookname;
		this.id=id;
		this.ref=ref;
		
	}
	public void display()
	{
		System.out.println(ref.name+ " " + ref.age);
		System.out.println(bookname + " " +id);
	}

	public static void main(String[] args) {
		AutherDetail obj=new AutherDetail("Harsha",27);
		BookDetails obj1=new BookDetails("Red",1,obj);
		obj1.display();
		// TODO Auto-generated method stub

	}

}
