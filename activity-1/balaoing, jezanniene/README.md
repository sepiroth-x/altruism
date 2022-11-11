
* Name: Balaoing,Jezanniene
* Section: Altruism
* Year: 4th Year
*/
```
import java. util.*;

public class Main{

public static void main(string []args)
{
Scanner scanER= new Scanner (System.in); 
int Grades=0, choices, i=0;
double total=0;
do {
System.out.println("1-YES");
System.out.println("0-NO");
System.out.println("DO YOU WANT TO ENTER A GRADE?");

if (choices==1) {
System.out.println("PLEASE ENTER A GRADE:" );
Grades = scanER. nextInt();
total += Grades;
i++;
}
} while (choices==1);
total = total/i;
System.out.println ("Total average: "+ total);

}
}
