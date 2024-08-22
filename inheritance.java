import java.time.LocalDate;
import java.time.Period;

class Person {
    private String name;
    private LocalDate dob; 
    private double height;
    private String address;

    public Person(String name, LocalDate dob, double height, String address) {
        this.name = name;
        this.dob = dob;
        this.height = height;
        this.address = address;
    }
     public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

public int calculateAge() {
        if (dob != null) {
            return Period.between(dob, LocalDate.now()).getYears();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", DOB: " + dob + ", Height: " + height + ", Address: " + address;
    }
}

class Student extends Person {
    private int rollNo;
    private double marks;

    public Student(String name, LocalDate dob, double height, String address, int rollNo, double marks) {
        super(name, dob, height, address);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return super.toString() + ", Roll No: " + rollNo + ", Marks: " + marks;
    }
}

class Employee extends Person {
    private int id;
    private double salary;

    
    public Employee(String name, LocalDate dob, double height, String address, int id, double salary) {
        super(name, dob, height, address);
        this.id = id;
        this.salary = salary;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

  
    public double calculateTax() {
        return salary * 0.20;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + id + ", Salary: " + salary + ", Tax: " + calculateTax();
    }
}

public class Main {
    public static void main(String[] args) {
       
        Person person = new Person("Atharv", LocalDate.of(2004, 5, 6), 6.0 , "123 Ichalkaranji");
        System.out.println(person);
        System.out.println("Age: " + person.calculateAge());

        
        Student student = new Student("Parth", LocalDate.of(2004, 3, 31), 5.11 , "456 Pune", 101, 89.5);
        System.out.println(student);
        System.out.println("Age: " + student.calculateAge());
       
        Employee employee = new Employee("Nikhil", LocalDate.of(1999, 9, 22), 5.9 , "789 Mumbai", 1001, 50000.0);
        System.out.println(employee);
        System.out.println("Age: " + employee.calculateAge());
    }
}
