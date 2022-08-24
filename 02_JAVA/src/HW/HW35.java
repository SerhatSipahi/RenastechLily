package HW;

import code.Day_28_OOP_Inheretence.Super.Car;

public class HW35 {
  /*  Write a Car Class where it has following attributes:
1) Model
2) Year
3) Speed
And following method:
1) SetAttributes()-  Where it takes String Model, int Year and double speed to set all the instance attribute.
2) PrintCar() - Where it prints each objects attributes
3) IncreaseSpeed() - Where it takes double values and it increase the Speed attribute by input amount
4) DecreaseSpeed() - Where it takes double values and it decrease the Speed attribute by input amount
Create 4 instance of Car Class, after Setting the Attribute values, Apply increaseSpeed and DecreaseSpeed Multiple times for different values. For those which
has speed of 80 or more, Print warning such as "Car "Model" and"Speed" is danger of getting ticket*/

    String CarClass1 = " ";
    String CarClass2 = " ";
    String CarClass3 = " ";
    String CarClass4 = " ";

    public String Car11(){

        String CarModel = " ";
        int CarYear ;
        double CarSpeed;
        return Car();

    }

    public String SetAttributes(){
        CarClass1 car1 = new Car11("BMW","i8",2022,);
        CarClass2 car2 = new Car("Toyota","Highlander",2022);
        CarClass3 car3 = new Car("Audi","A8",2022);
        return SetAttributes();
    }
    public String PrintCar(){
        System.out.println(CarClass1);
        System.out.println(CarClass2);
        System.out.println(CarClass3);
        return PrintCar();
    }
    public double IncreaseSpeed(){

    }


}