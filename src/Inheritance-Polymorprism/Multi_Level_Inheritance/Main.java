// Java demonstrate the running single inheritance
public class Main {
    // Main function
    public static void main(String[] args) {
        // Child class object call
        Child c1=new Child("Dev","Kapoor",19,78.5f,5.11f);
        System.out.println("Child Information Print: ");
        c1.details();
        // Baby blass object call
        System.out.println("Baby Information: ");
        Baby b1=new Baby("Roy","Kapoor",19,78.5f,5.11f,"Male");
        b1.information();
    }
}
