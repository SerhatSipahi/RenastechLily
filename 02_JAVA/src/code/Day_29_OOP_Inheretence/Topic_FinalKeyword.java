package code.Day_29_OOP_Inheretence;

public class Topic_FinalKeyword {

    // final key word is used to set the values and methods so they can not be changed.
    // y = 2x+10 --- > 2 and 10 are constant values.
    // pi value is a constant value.

    public final void Name(){
        System.out.println("This is from the Final method");
    }

    public static void main(String[] args) {
        final int size = 14;
       //  x = 78; this will cause error, final variables can not be reassigned.
        String [] cla = new String[size];
        Topic_FinalKeyword ky = new Topic_FinalKeyword();
        ky.Name();
    }

}
