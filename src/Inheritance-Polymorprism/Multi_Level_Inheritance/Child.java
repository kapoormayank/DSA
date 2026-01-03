// Java demonstrate the child class with inherit by parent class
public class Child extends Parent{
    int age;
    float weight;
    float height;
    // Dynamic Constructor
    public Child(String first_name,String last_name,int age,float weight,float height){
        super(first_name,last_name);
        this.age=age;
        this.weight=weight;
        this.height=height;
    }
    // Child class function
    public void details(){
        System.out.println("First Name: "+this.first_name);
        System.out.println("Last Name: "+this.last_name);
        System.out.println("Age: "+this.age);
        System.out.println("Weight: "+this.weight);
        System.out.println("Height: "+this.height);
        System.out.println();
    }
}
