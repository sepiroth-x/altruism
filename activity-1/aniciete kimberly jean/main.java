package javacode;
import java.util.Scanner;
public class Main {

  public static void main (String[]args){

	Scanner console = new Scanner (System.in);

   int yn = 0, total = 0, mygrade = 0, i = 0;

do{
	System.out.println ("Do you want to enter a grade?");
	System.out.println ("Press 1 == YES");
	System.out.println ("Press 2 == NO");
   	yn = console.nextInt();

if ( yn == 1){
	System.out.println ("You chose YES");
	System.out.println ("Please enter a grade:");
	mygrade = console.nextInt();
	total += mygrade;
	i++;
}else{
	System.out.println ("You chose NO"); }
}while (yn == 1);

	total = total / i;

	System.out.print ("Total average is: " +total);

	}
}
