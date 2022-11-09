package submissions;

/**
 * Name: Aldren Bacho
 * Section: Altruism 
 * Year: 4th 
 * 
 * 
 * */

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

// write a program that ask the user to enter a grade.
   // if yes, the user will enter a grade
   // while the user choose yes, the user keeps on entering a grade
   // when the user choose no, display the average of the grades entered.
   int grado, sum=0, count=0;
   char g;
		Scanner grade = new Scanner(System.in);

      while (true){
		    System.out.println("\nDo you want to Enter a Grade? ");
		System.out.println("((Y) for Yes ..... (N) for No)");
		System.out.print("Y/N : ");
		g = grade.next().charAt(0);


		        if ((g == 'y') || (g == 'Y')) {
		        System.out.println("\n\n(You choose Yes)");
		        System.out.print("Please Enter Grade: ");
		         grado = grade.nextInt();
	  	       sum += grado;
		         count++;

		          }


		          else if ((g == 'n') || (g == 'N')) {
	              System.out.printf("The avarage of grades: " +(sum/count) );
	       	    break;
	           	}

	           	else {
	       	    System.out.print("Choose only Y/N\n");

	                }


           }






	}
}