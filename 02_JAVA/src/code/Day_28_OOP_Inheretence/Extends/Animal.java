package code.Day_28_OOP_Inheretence.Extends;

public class Animal {

    public String Name;
    public double Age;
    public String Gender;
    public String Color;
    public int legcount;


    public void Eat(){
        System.out.println("Animals eat");
    }
    public void Grow(){
        System.out.println("Animals grow");

    }
    public void Display(){
        System.out.println("Name: "+Name + " Age: "+Age+ " Color: "+Color+" Leg Count: "+legcount+" Gender: "+Gender);
    }
    public String toString(){
        return "Name: "+Name + " Age: "+Age+ " Color: "+Color+" Leg Count: "+legcount+" Gender: "+Gender;
    }
}