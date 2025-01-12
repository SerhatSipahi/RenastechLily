package code.StudyHalls.Week9.session3;

public class CellPhone {
    // Instances

    String make;
    String model;
    private int price;
    private int percentageOfBattery;
    public int getPercentageOfBattery() {
        return percentageOfBattery;
    }

    public void chargeBattery(int charging)
    {
        if(charging <= 0)
        {
            System.out.println("we couldn't charge the phone");
        }else if(charging>=100)
        {
            this.percentageOfBattery = 100;
        }
        else
        {
            if(percentageOfBattery + charging>100)
            {
                percentageOfBattery = 100;
            }
            else
            {
                percentageOfBattery += charging;
            }
        }

    }


    //Encapsulation getter
    public int getPrice() {
        return price;
    }

    //Encapsulation Setter
    public void setPrice(int price) {
        if(price<=0)
        {
            System.out.println("The price cannot be less then or equal to 0!");
        }
        else {
            this.price= price;
        }
    }



    static
    {
        System.out.println("Phone object is created");
    }

    //constructor
    public CellPhone(String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    public void usePhone(int min)
    {
        if(percentageOfBattery<=1)
        {
            System.out.println("Insiffucent battery");
        }
        else
        {
            percentageOfBattery -= min*2;
            //If the battery finished after the makeCall()
            if(percentageOfBattery<=100)
            {
                System.out.println("Battery Die!!");
                percentageOfBattery =0;
            }
        }
    }


    public String toString()
    {
        return "Make: " + make + "\r\n"
                +"Model: " + model +"\r\n"
                + "Price: " + price + "\r\n"
                +"Percentage of Battery: " + getPercentageOfBattery() + "\r\n ----------";
    }


}
