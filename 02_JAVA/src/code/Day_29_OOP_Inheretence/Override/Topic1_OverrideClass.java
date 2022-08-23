package code.Day_29_OOP_Inheretence.Override;

public class Topic1_OverrideClass {

    public String Firstname;
    public String Lastname;
    public int age;

    public void Display(){
        System.out.println("The firsname: "+Firstname+" Lastname: "+Lastname+" Age: "+age);
    }
    public void Eat(){
        System.out.println("People Eat");
    }
    protected void Sub(){
        System.out.println("This is protected Method");
    }
}
