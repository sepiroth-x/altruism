import java.util.*;
public class Aljune {       
  public static void main(String[] args){   
   Scanner console = new Scanner (System.in);     
    int n = 0, s = 0, repeatCount = 0;
    char catcher; 
    do{
        System.out.println("\nWould you like to enter grades?\nY-yes\nN-no");  
        System.out.print("=> ");
        catcher = console.next().charAt(0);       
        if((catcher == 'y')||(catcher == 'Y')){ 
        System.out.print("Enter a grade: "); 
        n = console.nextInt();             	                  
        s += n;
        repeatCount++;}
    }while((catcher == 'y')||(catcher == 'Y'));    
        System.out.println("\n**************************");
	       System.out.print("\nThe Average Grade is: " +(s/repeatCount));
        System.out.print("\n\n**************************");        
  }
}
