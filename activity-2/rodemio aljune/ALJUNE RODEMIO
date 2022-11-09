// Sir naay paagi nga ma short ni ang source code sir?
// Feel nako taas ra kaayu para sa simple nga program.
// I tried to use white spaces for the alignment.
import java.util.*;
public class Aljune2 { 
  public static void main(String[] args){   
   Scanner console = new Scanner (System.in);     
    int iK=0, iS=0, ikL=0, imJ=0, icP=0, iP=0, iC=0, iB=0, iR=0, i=0, m=0, n=0, s=0;
    int kulafu=0, sting=0, kulating=0, crispyPatata=0, mangJuan=0, piatos=0, chicken=0, ramen=0, burgerSteak=0;
    int kM=0, sM=0, klM=0,cpM=0, rmJ=0, pM=0, cM=0, rM=0, bM=0;
    String[] item = new String[]{" "," "," "," "," "," "," "," "," "};
    char catcher;   
  
        System.out.print("\nWould you like to order?\nY-yes\nN-no\n=> "); 
    do{ 
        catcher = console.next().charAt(0);       
        if((catcher == 'y')||(catcher == 'Y')){ 
        System.out.print("\nFOODS:\t\t   Price\n1-Chicken----------₱25\n2-Ramen------------₱149\n3-Buger steak------₱50\n");
        System.out.print("\nSNACKS:\t\t   Price\n1-Crispy Patata----₱7\n2-Mang Juan--------₱8\n3-Piatos-----------₱17\n");
        System.out.print("\nBEVERAGES:\t   Price\n1-Kulafu-----------₱43\n2-Sting------------₱15\n3-Kulating---------₱58\n");
        System.out.print("\nInput Category Number\n1-Foods\n2-Snacks\n3-Beverages\n=> "); 
        n = console.nextInt();
        String category =" ";
        switch(n){
        case 1: 
            category = "FOOD";
        break;
        case 2:
        category = "SNACKS"; 
        break;
        case 3:
        category = "BEVERAGES";   
        s += n;
        break;
        default: 
        System.out.print("select from above list!");
        break;
        }           
        if(category.equals("FOOD")){
        System.out.print("Choose from the Food Menu: ");
        m = console.nextInt();
        System.out.print("Quantity: ");
        i = console.nextInt();
          switch(m){           
            case 1:
            iC += i;
            chicken = 25;
            cM = chicken*iC;  
            item[0] = ("\nChicken\t----"+iC+"------------₱"+cM);
            break;
            case 2:
            iR += i;
            ramen = 149; 
            rM = ramen*iR;
            item[1] = ("\nRamen\t----"+iR+"------------₱"+rM);
            break;
            case 3:
            iB += i;
            burgerSteak = 50;  
            bM = burgerSteak*iB;  
            item[2] = ("\nBurger\nSteak\t----"+iB+"------------₱"+bM);
            break;
            default:
            System.out.print("Select above list only!");
            break;
            }     
        }
        else if(category.equals("SNACKS")){
        System.out.print("Choose from the Snacks Menu: ");
        m = console.nextInt();
        System.out.print("Quantity: ");
        i = console.nextInt();
          switch(m){           
            case 1:
            icP += i;
            crispyPatata = 7;
            cpM = crispyPatata*iC;  
            item[3] = ("\nCrispy\nPatata\t----"+icP+"------------₱"+cpM);
            break;
            case 2:
            imJ += i;
            mangJuan = 8; 
            rmJ = mangJuan*imJ;
            item[4] = ("\nMangJuan----"+imJ+"------------₱"+rmJ);
            break;
            case 3:
            iP+= i;
            piatos = 17;  
            pM = piatos*iP;  
            item[5] = ("\nPiatos\t----"+iP+"------------₱"+pM);
            break;
            default:
            System.out.print("Select above list only!");
            break;
            }     
        }       
        else if(category.equals("BEVERAGES")){
        System.out.print("Choose from the Beverage Menu: ");
        m = console.nextInt();
        System.out.print("Quantity: ");
        i = console.nextInt();
          switch(m){           
            case 1:
            iK += i;
            kulafu = 43;
            kM = kulafu*iK;  
            item[6] = ("\nKulafu\t----"+iK+"------------₱"+kM);
            break;
            case 2:
            iS += i;
            sting = 15; 
            sM = sting*iS;
            item[7] = ("\nSting\t----"+iS+"------------₱"+sM);
            break;
            case 3:
            ikL+= i;
            kulating = 58;  
            klM = kulating*ikL;  
            item[8] = ("\nKulating----"+ikL+"------------₱"+klM);
            break;
            default:
            System.out.print("Select above list only!");
            break;
            }     
        } 
        System.out.print("\nWould you to add more?\nY-yes\nN-no\n=> ");       
      }
     }while((catcher == 'y')||(catcher == 'Y'));    
        System.out.println("\n_______________________________");
        System.out.print("\nItem\t Quantity\t Total");
        System.out.println("\n_______________________________\n");
	       System.out.print("\n"+item[0]+"\n"+item[1]+"\n"+item[2]+"\n"+item[3]+"\n"+item[4]+"\n"+item[5]+"\n"+item[6]+"\n"+item[7]+"\n"+item[8]);
        System.out.println("\n_______________________________\n");
        System.out.print("Bill---------------------₱"+(cM+rM+bM+cpM+rmJ+pM+kM+sM+klM));  
        System.out.printf("\n\n\n");
  }
}
