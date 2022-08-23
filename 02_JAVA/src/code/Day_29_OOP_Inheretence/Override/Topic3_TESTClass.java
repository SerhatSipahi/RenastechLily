package code.Day_29_OOP_Inheretence.Override;

public class Topic3_TESTClass {
    public static void main(String[] args) {
        Topic2_OverrideTest Bakir  = new Topic2_OverrideTest();

        Bakir.Firstname = "Bakir";
        Bakir.Lastname = "Murad";
        Bakir.age = 23;

        Bakir.Display();
        Bakir.Eat();
        Topic1_OverrideClass people = new Topic1_OverrideClass();
        System.out.println("______________________________________");
        people.Firstname = "People";
        people.Lastname = "Human";
        people.age = 109;

        people.Eat();
    }
}
