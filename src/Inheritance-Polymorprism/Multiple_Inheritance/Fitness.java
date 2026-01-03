// Java demonstrate Fitness class Is Multiple Inheritance
public class Fitness extends Animal implements Speed{
    public void fast(){
        System.out.println("Fast animal!");
    }
    @Override
    public void speed(){
        System.out.println("Speed of animal is very fast");
    }
    public void display(){
        eat();
        fast();
        speed();
    }
}
