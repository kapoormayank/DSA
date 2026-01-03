//Parent Calss of Human Class

public class Species{
    String name; // Data Members
    int age;
    String gender;
    // Constructor
    public Species(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    // Parent class Function
    public void details()
    {
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Gender : "+this.gender);
    }
}