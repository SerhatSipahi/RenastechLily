package code.Day_3ArtimaticOperations;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Addition (+) it is used to add number.
        int number1 = 10;
        int number2 = 20;
        float numberf1 = 40.7f;
        double numberd1 = 76.987438;
        long numberl1 = 6476487834l;

       // int number5 = number1 + numberf1; will throw error

        float number3 = number1 + numberf1;
        //float num1 = 10.6f;
        //float num2 = 5.4f;

        //int num3 = num1+num2;
        //16.0


        System.out.println(number1+numberf1);

        System.out.println(number3);

        // Subtraction (-)

        int num4 = 50;
        int num5 = 70;
        //int num6 = num4-num5;
        //System.out.println(num6);
        System.out.println(num4 - num5);

        int num7 = 80;
        float num8 = 90.6f;
        float num9 = num7-num8;

        long num10 = 763673l;
        int num11 = 786;
        long num12 =  num10+num11;

        // multiplication (*)
        int multi1 = 20;
        int multi2 = 30;
        int multi3 = multi1 * multi2;
        System.out.println(multi1 * multi2);
        System.out.println(multi3);

        // Division (/)
        int divis1 = 60;
        int divis2 = 30;
        int divis3 = divis1/divis2;
        System.out.println(divis3);

        int divis4 = 4;
        int divis5 = 3;
        float divis6 =(float) divis4/divis5;
        System.out.println(divis6);
        System.out.println(divis4/divis5);

        // modulus (%), It gives you the reminder

        int mod1 = 10;
        int mod2 = 5;

        int mod3 = 10%5;
        System.out.println(mod3);

        int mod4 = 11;
        int mod5 = 5;
        System.out.println(mod4%mod5);

        float mod6 = 5.8f;
        int mod7 = 2;
        float mod8 = mod6%mod7;
        System.out.println(mod8);

        int n = 10;
        int m = 5;
        int c = 10%5;
        System.out.println(c);

    }
}
