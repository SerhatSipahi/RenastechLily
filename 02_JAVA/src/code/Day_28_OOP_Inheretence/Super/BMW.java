package code.Day_28_OOP_Inheretence.Super;

public class BMW extends Car{

    public double engineSize;

    public BMW(String make,String mdl,int yr,double size){
        super(mdl,make,yr);// This caling the Super class Constructor (chainning) and setting the values.
        this.engineSize = size;
    }

    public void Fly(){
        super.Speed();
        System.out.println("It also Fly");
    }
    public void Print(){
        String s = super.display();

        s = s + "The Engine Size: "+engineSize;

        System.out.println(s);

    }





}
