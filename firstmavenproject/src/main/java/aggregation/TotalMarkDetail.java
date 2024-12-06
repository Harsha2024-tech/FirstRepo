package aggregation;

public class TotalMarkDetail {
	
	StudentDetail ref;
	public TotalMarkDetail(StudentDetail ref)
	{
		
		this.ref=ref;
	}
	public void totalmark()
	{
		int total=ref.mark1+ref.mark2;
		System.out.println("total mark is:" +total);
	}

	public static void main(String[] args) {
		StudentDetail obj=new StudentDetail(50,60);
		TotalMarkDetail obj1=new TotalMarkDetail(obj);
		obj1.totalmark();
		// TODO Auto-generated method stub

	}

}
