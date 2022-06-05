package JavaBal;

class Employee{
    int salary = 10000;


}
class Programmer extends Employee{
    int prgBonus = 5000;

}
class Manager extends Programmer{
    int mgrBonus = 3000;

}
public class InheritanceDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        int managaerSalary = mgr.salary;
        System.out.println(managaerSalary);


    }
}
