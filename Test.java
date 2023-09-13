import java.util.Scanner;

interface Staff_Op {
    double calculateSalary();
}

interface Student_Op {
    void calculateFees();
}


class Person {
    String name;
    String address;
    int phone_no;
    String email;
    int age;

    public Person(String name, String address, String email, int phone_no, int age) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone_no = phone_no;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone_no;
    }

    public int getAge() {
        return age;
    }
}

class Staff extends Person implements Staff_Op {
    int empid;
    String dept;
    String designation;

    public Staff(String name, String address, String email, int phone_no, int age, int empid, String dept,
            String designation) {
        super(name, address, email, phone_no, age);
        this.empid = empid;
        this.dept = dept;
        this.designation = designation;
    }

    public int getEmpId() {
        return empid;
    }

    public String getDept() {
        return dept;
    }

    public String getDesign() {
        return designation;
    }

    @Override
    public double calculateSalary() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your basic pay:");
        int basic = s.nextInt();

        return basic + 12000;
    }
}

class Student extends Person implements Student_Op {
    String usn;
    String branch;

    public Student(String name, String address, String email, int phone_no, int age, String usn, String branch) {
        super(name, address, email, phone_no, age);
        this.usn = usn;
        this.branch = branch;
    }

    public String getUsn() {
        return usn;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public void calculateFees() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your basic pay:");
        int basic = s.nextInt();

        double fees = basic + 12000;
        System.out.println("Total fees: $" + fees);
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Staff Details");
        System.out.println("2. Student Details");
        System.out.println("0. Exit");

        int option = scanner.nextInt();
        while (option != 0) {
            switch (option) {
                case 1:
                    showStaffDetails();
                    break;
                case 2:
                    showStudentDetails();
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }

            System.out.println("\nChoose an option:");
            System.out.println("1. Staff Details");
            System.out.println("2. Student Details");
            System.out.println("0. Exit");

            option = scanner.nextInt();
        }
    }

    public static void showStaffDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter staff name: ");
        String name = scanner.nextLine();
        System.out.print("Enter staff address: ");
        String address = scanner.nextLine();
        System.out.print("Enter staff email: ");
        String email = scanner.nextLine();
        System.out.print("Enter staff phone number: ");
        int phone_no = scanner.nextInt();
        System.out.print("Enter staff age: ");
        int age = scanner.nextInt();
        System.out.print("Enter staff employee ID: ");
        int empid = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter staff department: ");
        String dept = scanner.nextLine();
        System.out.print("Enter staff designation: ");
        String designation = scanner.nextLine();

        Staff staff = new Staff(name, address, email, phone_no, age, empid, dept, designation);

        System.out.println("\nStaff Details:");
        System.out.println("Name: " + staff.getName());
        System.out.println("Age: " + staff.getAge());
        System.out.println("Employee ID: " + staff.getEmpId());
        System.out.println("Department: " + staff.getDept());
        System.out.println("Designation: " + staff.getDesign());
        System.out.println("Salary: $" + staff.calculateSalary());
    }

    public static void showStudentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student address: ");
        String address = scanner.nextLine();
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();
        System.out.print("Enter student phone number: ");
        int phone_no = scanner.nextInt();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter student USN: ");
        String usn = scanner.nextLine();
        System.out.print("Enter student branch: ");
        String branch = scanner.nextLine();

        Student student = new Student(name, address, email, phone_no, age, usn, branch);

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("USN: " + student.getUsn());
        System.out.println("Branch: " + student.getBranch());
        student.calculateFees();
    }
}

















// import java.util.Scanner;

// interface Staff_Op {
//     double calculateSalary();
// }

// interface Student_Op {
//     void calculateFees();
// }

// class Person {
//     String name;
//     String address;
//     int phone_no;
//     String email;
//     int age;

//     public Person(String name, String address, String email, int phone_no, int age) {
//         this.name = name;
//         this.address = address;
//         this.email = email;
//         this.phone_no = phone_no;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getAddress() {
//         return address;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public int getPhone() {
//         return phone_no;
//     }

//     public int getAge() {
//         return age;
//     }
// }

// class Staff extends Person implements Staff_Op {
//     int empid;
//     String dept;
//     String designation;

//     public Staff(String name, String address, String email, int phone_no, int age, int empid, String dept,
//             String designation) {
//         super(name, address, email, phone_no, age);
//         this.empid = empid;
//         this.dept = dept;
//         this.designation = designation;
//     }

//     public int getEmpId() {
//         return empid;
//     }

//     public String getDept() {
//         return dept;
//     }

//     public String getDesign() {
//         return designation;
//     }

//     @Override
//     public double calculateSalary() {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter your basic pay:");
//         int basic = s.nextInt();

//         return basic + 12000;
//     }
// }

// class Student extends Person implements Student_Op {
//     String usn;
//     String branch;

//     public Student(String name, String address, String email, int phone_no, int age, String usn, String branch) {
//         super(name, address, email, phone_no, age);
//         this.usn = usn;
//         this.branch = branch;
//     }

//     public String getUsn() {
//         return usn;
//     }

//     public String getBranch() {
//         return branch;
//     }

//     @Override
//     public void calculateFees() {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter your basic fee:");
//         int basic = s.nextInt();

//         double fees = basic + 12000;
//         System.out.println("Total fees: $" + fees);
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Staff staff = new Staff("John Doe", "123 Main St", "john.doe@example.com", 1234567890, 30, 1234,
//                 "ABC Company", "Manager");
//         Student student = new Student("Jane Smith", "456 Elm St", "jane.smith@example.com", 987654210, 20,
//                 "12345678", "Computer Science");

//         System.out.println("Staff Details:");
//         System.out.println("Name: " + staff.getName());
//         System.out.println("Age: " + staff.getAge());
//         System.out.println("Employee ID: " + staff.getEmpId());
//         System.out.println("Department: " + staff.getDept());
//         System.out.println("Designation: " + staff.getDesign());
//         System.out.println("Salary: $" + staff.calculateSalary());

//         System.out.println();

//         System.out.println("Student Details:");
//         System.out.println("Name: " + student.getName());
//         System.out.println("Age: " + student.getAge());
//         System.out.println("USN: " + student.getUsn());
//         System.out.println("Branch: " + student.getBranch());
//         student.calculateFees();
//     }
// }
















// // import java.util.Scanner;

// // interface Staff_Op
// // {
// //     public double calculate_Salary();
    
// // }

// // interface Student_Op
// // {
// //     public void Calculate_Fees();
// // }

// //  class Person
// // {
// //     String name;
// //     String address;
// //     int phone_no;
// //     String email;
// //     int age;



    
// //     public Person(String name,String address,String email,
// //     int phone_no,int age)
// //     {
// //         this.name=name;
// //         this.address=address;
// //         this.email=email;
// //         this.phone_no=phone_no;
// //         this.age=age;
// //     }

// //     public String getName()
// //     {
// //         return name;
// //     }

// //     public String getAddress()
// //     {
// //         return address;
// //     }

// //     public String getEmail()
// //     {
// //         return email;
// //     }

// //     public int getPhone()
// //     {
// //         return phone_no;
// //     }

// //     public int getAge()
// //     {
// //         return age;
// //     }


// // }

// // class Staff extends Person implements Staff_Op
// // {
// //     int empid;
// //     String dept;
// //     String designation;

// //     public Staff(String name,String address,String email,
// //     int phone_no,int age, int empid,String dept,String designation)
// //     {
// //         super(name,address,email,phone_no,age);
// //         this.empid=empid;
// //         this.dept=dept;
// //         this.designation=designation;
// //     }

// //     public String getDept()
// //     {
// //         return dept;
// //     }

// //     public String getDesign()
// //     {
// //         return designation;
// //     }

// //     @Override
// //     public double calculate_Salary()
// //     {
// //         Scanner s=new Scanner(System.in);
// //         System.out.print("Enter your basic pay:")
// //         int basic=s.nextInt();

// //         return basic+12000;

// //     }

// // }

// // class Student extends Person implements Student_Op
// // {
// //     public String usn;
// //     public String branch;


// //     public Student(String name,String address,String email,
// //     int phone_no,int age,String usn,String branch)
// //     {
// //         super(name,address,email,phone_no,age)
// //         this.usn=usn;
// //         this.branch=branch;
// //     }

// //     @Override
// //     public double Calculate_Fees()
// //     {
// //         Scanner s=new Scanner(System.in);
// //         System.out.print("Enter your basic pay:")
// //         int basic=s.nextInt();

// //         return basic+12000;
// //     }

// //     public String getUsn()
// //     {
// //         return usn;
// //     }

// //     public String getbranch()
// //     {
// //         return branch;
// //     }

// // }


// // public class Test {
// //     public static void main(String[] args) {
// //         Staff staff = new Staff("John Doe", 30, 1234, "ABC Company");
// //         Student student = new Student("Jane Smith", 20, "XYZ University", "Computer Science");

// //         System.out.println("Staff Details:");
// //         System.out.println("Name: " + staff.getName());
// //         System.out.println("Age: " + staff.getAge());
// //         System.out.println("Employee ID: " + staff.getEmpId());
// //         System.out.println("Company: " + staff.getCompany());
// //         System.out.println("Salary: $" + staff.calculateSalary());

// //         System.out.println();

// //         System.out.println("Student Details:");
// //         System.out.println("Name: " + student.getName());
// //         System.out.println("Age: " + student.getAge());
// //         System.out.println("University: " + student.getUniversity());
// //         System.out.println("Major: " + student.getMajor());
// //         System.out.println("Fees: $" + student.calculateFees());
// //     }
// // }