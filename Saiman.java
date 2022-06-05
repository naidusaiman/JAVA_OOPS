package JavaBal;

class Animal{
    public void move(){
        System.out.println("Move");
    }
}
class Bird extends Animal{
    //@Override
    /*public void move() {
        System.out.println("Flying");
    }*/
}
class Fish extends Animal{
    @Override
    public void move() {
        System.out.println("Swimming");
    }
}
public class Saiman {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.move();
        Fish fish = new Fish();
        fish.move();

    }
}
