import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner code=new Scanner(System.in);
		int total=0,item;
		System.out.println("DO YOU WANT TO MAKE AN ORDER?\n[1]YES    [2]NO");
		int i=code.nextInt();
		while(i==1){
		    System.out.println("SELECT FOR CATEGORIES BELOW:");
		    System.out.println("[1]FOODS\n[2]SNACKS\n[3]BEVERAGES");
		    int ctgry=code.nextInt();
		    
		    if(ctgry==1){
		        System.out.println("--YOU SELECTED FOODS--");
		        //FOOD CHOICES//
		       System.out.println("[1]CHICKEN: $15");
		       System.out.println("[2]RAMEN: $20");
		       System.out.println("[3]HOTDOG: $5");
		       System.out.println("[4]ADOBO: $25");
		       System.out.println("[5]SISIG: $25");
		       
		        System.out.println("ENTER ITEM:");
		        item=code.nextInt();
		        //FOOD PRICES//
		        if (item==1){
		            System.out.println("YOU SELECTED 1pc CHICKEN");
		            total=total+15;
		            }else if (item==2){
		            System.out.println("YOU SELECTED 1pc RAMEN");
		            total=total+20;
		            }else if (item==3){
		            System.out.println("YOU SELECTED 1pc HOTDOG");
		            total=total+25;
		            }else if (item==1){
		            System.out.println("YOU SELECTED 1pc ADOBO");
		            total=total+25;
		            }else if (item==5){
		            System.out.println("YOU SELECTED 1pc SISIG");
		            total=total+25;
		            }else{
		                System.out.println("INVALID KEY");
		            }
		        
		    }else if(ctgry==2){
		        System.out.println("--YOU SELECTED SNACKS--");
		        //SNACKS CHOICES//
		       System.out.println("[1]BOLABOLA: $10");
		       System.out.println("[2]TEMPURA: $20");
		       System.out.println("[3]FISHBALL: $5");
		       System.out.println("[4]SQUIDBALLS: $15");
		       System.out.println("[5]SIOMAI: $25");
		        //SNACKS PRICES//
		        System.out.println("ENTER ITEM:");
		        item=code.nextInt();
		        if (item==1){
		            System.out.println("YOU SELECTED 1pc BOLABOLA");
		            total=total+10;
		            }else if (item==2){
		            System.out.println("YOU SELECTED 1pc TEMPURA");
		            total=total+20;
		            }else if (item==3){
		            System.out.println("YOU SELECTED 1pc FISHBALL");
		            total=total+5;
		            }else if (item==4){
		            System.out.println("YOU SELECTED 1pc SQUIDBALLS");
		            total=total+15;
		            }else if (item==5){
		            System.out.println("YOU SELECTED 1pc SIOMAI");
		            total=total+25;
		            }else{
		                System.out.println("INVALID KEY");
		            }
		    }else if(ctgry==3){
		        System.out.println("--YOU SELECTED BEVERAGES--");
		        //BEVERAGE CHOICES//
		       System.out.println("[1]GSM: $100");
		       System.out.println("[2]BEER: $50");
		       System.out.println("[3] SMIRNOFF: $70");
		       System.out.println("[4] MINUTE MAID: $20");
		       System.out.println("[5]STING: $15");
		       //BEVERAGE PRICES//
		       System.out.println("ENTER ITEM:");
		        item=code.nextInt();
		        if (item==1){
		            System.out.println("YOU SELECTED 1pc GSM");
		            total=total+100;
		            }else if (item==2){
		            System.out.println("YOU SELECTED 1pc BEER");
		            total=total+50;
		            }else if (item==3){
		            System.out.println("YOU SELECTED 1pc SMIRNOFF");
		            total=total+70;
		            }else if (item==4){
		            System.out.println("YOU SELECTED 1pc MINUTE MAID ");
		            total=total+20;
		            }else if (item==5){
		            System.out.println("YOU SELECTED 1pc STING");
		            total=total+15;
		            }else{
		                System.out.println("INVALID KEY");
		            }
		    }else{
		        System.out.println("INVALID KEY.");
		    }
		    System.out.println("DO YOU WANT TO MAKE ANOTHER PURCHASE?\n[1]YES    [2]NO");
		    i=code.nextInt();
		}
		System.out.println("TOTAL PURCHACE:"+total);
	}
}
