import java.util.Scanner;

class Employee{
    Scanner sc= new Scanner(System.in);
    String fname;
    String lname;
    Double salary;
    Employee(){
        this.fname="none";
        this.lname="none";
        this.salary=0.0;
    }

    void setdata(){
        System.out.println("Enter First Name: ");
        fname=sc.next(); 
        
        System.out.println("Enter last name: ");
        lname=sc.next();
        System.out.println("Enter Employee Salary: ");
        salary= sc.nextDouble();
        if(salary<1){
            salary= 0.0;
        }
    }

    void getdate(){
        System.out.println("Employee name: "+fname+" "+lname);
        System.out.println("Salary: "+ salary);
        System.out.println("Yearly Salary: "+ salary*12);
        float yearly_raised_salary= (float) (((12*salary)*0.10)+(salary*12));
        System.out.println("Yay! You got 10% hike!"+"Yearly salary after raise: "+yearly_raised_salary);
        System.out.println("*************************************************************************************************************");
    }
}


public class Employee_Constructor {
    public static void main(String[] args) {
        Employee e1= new Employee();
        Employee e2= new Employee();
        e1.setdata();
        e2.setdata();
        e1.getdate();
        e2.getdate();

    }
}