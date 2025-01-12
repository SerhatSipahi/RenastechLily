package code.StudyHalls.Week3;

import java.util.Scanner;

public class Session1 {
    public static void main(String[] args) {

        /**
         *John and Mike both play basketball in different teams. In the latest 3 games, John's team scored 89,
         * 120 and 103 points, while Mike's team scored 116, 94, and 123 points.

         * 1. Calculate the average score for each team.
         *
         * 2. Decide which teams wins in average (highest average score), and print the winner to the console with if else statement.
         * Also include the average score in the output.
         *
         * 3. Then change the scores to show different winners.
         * Don't forget to take into acount there might be a draw (the same average score).
         */

        //John's team scores:  89, 120 and 103 points,
        //byte range : -128  to 127
        //short : -32768 to +32768
        //int

        short JohnTeam1=89;
        short JohnTeam2=143;
        short JohnTeam3=103;

        double JohnTeamAve= (JohnTeam1+JohnTeam2+JohnTeam3)/3;

        //Mike's team scores: 116, 94 and 123

        short mikeTeam1=116;
        short mikeTeam2=94;
        short mikeTeam3=123;

        double mikeTeamAve=(mikeTeam1+mikeTeam2+mikeTeam3)/3;

        System.out.println("JohnTeamAve = " + JohnTeamAve);
        System.out.println("mikeTeamAve = " + mikeTeamAve);
        System.out.println("************************");


        //   111 > 111
        if (JohnTeamAve > mikeTeamAve ){
            System.out.println("John's team won the game with the score of "+JohnTeamAve);
            // 111 > 111
        }else if (mikeTeamAve > JohnTeamAve){
            System.out.println("Mike's team won the game with the score of "+mikeTeamAve);
        }else {
            System.out.println("Both team has same score !!");
        }

        System.out.println("********************");


        //
        /**
         * /**
         *  * //Absolute value
         *  * //Write a program that asks the user to enter a number and displays the absolute value of that number.
         * */

        System.out.println("************************");
        int x= -760; // abs >> 20
        int y=-6000; // 50;

        if (x>0){
            System.out.println("Absolute value is " +x);

        } else if (x<0) {
            System.out.println("Absolute value is  " + (-x));

        }else {
            System.out.println("Absolute value is "+x);
        }

        System.out.println("**********************************");
        System.out.println("**********************************");

        int a=-120;// 120

        System.out.println("Math.abs(a) = " + Math.abs(a));

        System.out.println("***************************");

        //Question:
        // Ask user to enter a number by using scanner
        // if number is divided by 5 and 3 print FinRa
        // if number is divided by 3 print Fin
        //if number is divided by 5 print RA


        // Ask user to enter a number by using scanner
        Scanner scanner=new Scanner(System.in); //import java.util.Scanner;
        System.out.println("Please enter a number!");
        int input=scanner.nextInt(); // first number that you entered will be my input

        // if number is divided by 5 and 3 print FinRa
          if (input%5==0 &&  input %3==0 ){
              // FALSE && TRUE
              System.out.println("Finra");
          } else if (input %3==0) {
              //    if number is divided by 3 print Fin
              System.out.println("Fin");
          } else if (input % 5 == 0) {
              ///if number is divided by 5 print RA
              System.out.println("RA");

          }else {
              System.out.println(" Invalid number");
          }


    }
}
