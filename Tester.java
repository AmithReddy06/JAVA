import java.util.Scanner;

 class Person {

	String name;

	int age;

	String address;

	public void getDetails() {
		System.out.println("Enter Name:");
		Scanner sc1 = new Scanner(System.in);
		this.name = sc1.nextLine();
		System.out.println("Enter Age:");
		Scanner sc2 = new Scanner(System.in);
		this.age = sc2.nextInt();
		System.out.println("Enter Address:");
		Scanner sc3 = new Scanner(System.in);
		this.address = sc1.nextLine();

	}

	

	public void display() {

		System.out.println("Name = " + this.name + " Age = "+this.age + " Address = "+this.address);

	}

}



interface Staffop{

	public void cal_salary();

}



interface Studentop{

	public void cal_fee();

}



class Staff extends Person implements Staffop{

	float salary = 0;

	String empid;

	String department;

	float basic;

	Staff(String empid, String department, float basic) {

		super();

		this.empid = empid;

		this.department = department;

		this.basic = basic;

	}

	

	public void cal_salary() {

		int tax = 20;

		this.salary = this.basic - (tax/100)*this.basic;

	}



	public void display() {

		super.display();

		this.cal_salary();

		System.out.println("Total Salary = " + this.salary);

	}

}



class Student extends Person implements Studentop{

	float fee = 0;

	String usn;

	String major;

	float tuition;

	Student(String usn, String major, float tuition) {

		super();

		this.usn = usn;

		this.major = major;

		this.tuition = tuition;

	}

	

	public void cal_fee() {

		float bus_fee = 18000;

		this.fee = bus_fee + this.tuition;

	}



	public void display() {

		super.display();

		this.cal_fee();

		System.out.println("Total Fees = " + this.fee);

	}

}



class Tester{

	public static void main(String args[]){

		Staff st = new Staff("rvst1234", "CSA", 58500);

		Student s = new Student("rv102", "Physics", 32000);

		System.out.println("Enter Staff details:");

		st.getDetails();

		System.out.println("Staff details");

		st.display();

		System.out.println("Enter Student details:");

		s.getDetails();

		System.out.println("Student details");

		s.display();

	}

}