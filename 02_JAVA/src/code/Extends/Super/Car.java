package code.Extends.Super;

public class Car {

    public String Model;
    public String Make;
    public int year;

    public Car(String model,String make,int year){
        this.Model = model;
        this.Make = make;
        this.year = year;
    }

    public void Drive(){
        System.out.println(Model +" Drives");
    }
    public void Speed(){
        System.out.println(Model+" speed up");
    }

    public String display(){
        return "Model :"+Model+ " Make: "+Make+ " Year: "+year;
    }

}
