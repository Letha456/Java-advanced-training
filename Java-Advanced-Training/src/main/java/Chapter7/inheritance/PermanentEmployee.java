package Chapter7.inheritance;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/12/2026
 **/

public class PermanentEmployee extends Employee{
    private double salary;
    public PermanentEmployee(String empNumber, String name, String email, double sal) {
        super(empNumber, name, email);
        this.salary = sal;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void output(){
        System.out.println("Salary: " + getSalary());
    }

    @Override
    public  void display(){
        System.out.println(("Employee Number: " + getEmpNumber()));
        System.out.println(("Name: " + getName()));
        System.out.println(("Email: " + getEmail()));
        System.out.println(("Salary: " + getSalary()));
    }
}
