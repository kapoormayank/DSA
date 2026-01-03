// Java demonstrate the multi level class
public class Baby extends Child{
    public String gender;
    // Parameterize Constructor
    public Baby(String first_name, String last_name, int age, float weight, float height,String gender) {
        super(first_name, last_name, age, weight, height);
        this.gender=gender;
    }
    // Baby Function
    public void information(){
        System.out.println("First Name: "+this.first_name);
        System.out.println("Last Name: "+this.last_name);
        System.out.println("Age: "+this.age);
        System.out.println("Weight: "+this.weight);
        System.out.println("Height: "+this.height);
        System.out.println("Gender: "+this.gender);
    }
}
