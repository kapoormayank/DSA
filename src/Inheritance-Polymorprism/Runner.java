// Running file Of The Simple Inheritance
public class Runner{
    // Main function
    public static void main(String[] args) {
        // Inheritance
        // Parent Class Call 
        Species human = new Species("Micahel", 57, "Male");
        human.details();
        System.out.println();
        // Call Child Class
        Human human1 = new Human("Tyson",53,"Male",2025,95);
        human1.details();
        System.out.println();
        //Polymoriprism
        // Parent class refers the child class
        Species human2 = new Human("Kia",55,"Male",2025,99);
        human2.details();
    }
}
