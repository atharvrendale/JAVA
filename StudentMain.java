class Student {
    String name;
    int age;
    int RollNo;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.RollNo);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Atharv";
        s1.age = 21;
        s1.RollNo = 108;

        s1.printInfo();
    }
}