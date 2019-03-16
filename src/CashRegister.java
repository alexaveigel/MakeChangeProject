import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double bill10 = 10;
		double bill5 = 5;
		double bill1 = 1;
		double coin25 = 0.25;
		double coin10 = 0.10;
		double coin05 = 0.05;
		double coin01 = 0.01;
		int bill10Count = 0;
		int bill5Count = 0;
		int bill1Count = 0;
		int coin25Count = 0;
		int coin10Count = 0;
		int coin05Count = 0;
		int coin01Count = 0;
		
		

		System.out.println("Please enter the price of your item >> ");
		double itemPrice = sc.nextDouble();

		System.out.println("Please enter how much money are you inserting >> ");
		double moneyInserted = sc.nextDouble();
		double change = moneyInserted - itemPrice;
		
		System.out.println("Your change is >> " + (moneyInserted - itemPrice));

		if (moneyInserted == itemPrice) {
			System.out.println("Thank you for exact change! ");
		} else if (moneyInserted < itemPrice) {
			System.out.println("That is not enough money :( ");
		}
		
		while(change >= 10) {
			bill10Count++;
			change = change - 10;
		
		}
		while(change >= 5) {
			bill5Count++;
			change = change - 5;
		}
		while( change >= 1) {
			bill1Count++;
			change = change - 1;
		}
		while( change >= 0.25) {
			coin25Count++;
			change = change - 0.25;
		}
		while( change >= 0.10) {
			coin10Count++;
			change = change - 0.10;
		}
		while( change >= 0.05) {
			coin05Count++;
			change = change - 0.05;
		}
		while( change >= 0.01) {
			coin01Count++;
			change = change - 0.01;
		}
		
			

//		else if ((moneyInserted - itemPrice) > 10) {
//			System.out.println("You get one 10 dollar bill");
//			double change = ((moneyInserted - itemPrice) - 10);
//
//		}
//
//		else if (change > 5) {
//
//			System.out.println("You get one 5 dollar bill");
//
//		}
//		else if ((moneyInserted - itemPrice) > 1) {
//			System.out.println("You get one  dollar bill"); 
//		}
//		
//		
//		else if (moneyInserted  )
////	
//			do { 
//				
//		}

		sc.close();
	}
}
