package code.Extends.Super;

public class TestClass {

    public static void main(String[] args) {
        Car car1 = new Car("I8","BMW",2019);

        car1.display();
        car1.Drive();
        car1.Speed();
        System.out.println("++++++++++++++++++++++++++");

        BMW bm1 = new BMW("BMW","M4",2022,4.2);
        //bm1.display();
        bm1.Drive();
        bm1.Speed();
        bm1.Fly();
        bm1.Print();

    }




}
