package JavaBal;


abstract class Vehicle{
    public abstract void drive();
    public void speedUpVehicle(){
        System.out.println("Vehicle is speeding up");
    }
}

class Car extends Vehicle{

    @Override
    public void drive() {
        System.out.println("This is a Car");
    }
}
interface Bank{
    int withdraw(int amount);
    void deposit(int amount);
    void checkBalance();
}
class ICICI implements Bank{
    public ICICI(int balance){
        this.balance = balance;
    }
    int balance = 0;
    @Override
    public int withdraw(int amount) {
        if(amount < balance) {
            this.balance -= amount;
            System.out.println("Amount withdrawn: "+amount);
        }else{
            System.out.println("Insufficient Balance");
        }
        return 0;
    }

    @Override
    public void deposit(int amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("Amount deposited: "+amount);
        }else{
            System.out.println("Invalid Amount");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance: "+balance);
    }
}
class HDFC implements Bank{

    @Override
    public int withdraw(int amount) {
        return 0;
    }

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void checkBalance() {

    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        //Vehicle v = new Vehicle();
        //Bank b = new Bank();
        ICICI icici = new ICICI(300);
        HDFC hdfc = new HDFC();
        Car car = new Car();
        car.drive();
        car.speedUpVehicle();
    }
}
