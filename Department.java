class Department
{
private String name;
private int cap;
private int faculty;

	public Department(String name,int cap,int faculty)
	{
	this.name=name;
	this.cap=cap;
	this.faculty=faculty;
	}

	public void show()
	{
	System.out.print("Name: "+name+"\nCapacity: "+cap+"\nFaculty: "
	+faculty);
	}

	public void start()
	{
	System.out.print("\nStarting the department of "+name);
	}

	public static void main(String args[])
	{
	Department d1=new Department("MCA",120,20);
	Department d2=new Department("CSE",240,30);

	d1.show();
	d1.start();

	d2.show();
	d2.start();

	}
}
