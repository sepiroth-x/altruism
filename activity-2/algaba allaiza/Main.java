package submissions;

/**
 * Name: Allaiza Algaba
 * Section: Altruism 
 * Year: 4th 
 * 
 * 
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int input;
        Scanner mygrade = new Scanner(System.in);

        System.out.print("Your grade: ");
        float myfirstGrade = mygrade.nextFloat();

        System.out.print("Enter your grade: ");
        float mysecondGrade = mygrade.nextFloat();

        float sum = myfirstGrade + mysecondGrade;
        float ave = sum/2f;

        System.out.println("You want to add your grade?");

        System.out.println(" Enter 1 for Yes");
        System.out.println("Enter 2 for No");
         input = mygrade.nextInt();

         switch (input) {

             case 1: 
             System.out.println("If you choose YES");
             while (input==1) {
                 System.out.print("Enter grade: ");
                 float yourGrade= mygrade.nextFloat();
             }
             break;

             case 2:
             System.out.println("If you choose NO");

             System.out.printf("Your average is " + ave);
             break;

             default: 
             System.out.println("Answer correctly! (1 for Yes or 2 for No)");

         }


    }
}