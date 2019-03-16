import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the price of your item >> ");
		double itemPrice = sc.nextDouble();

		System.out.println("Pleas e enter how much money are you inserting >> ");
		double moneyInserted = sc.nextDouble();

		if (moneyInserted == itemPrice) {
			System.out.println("Thank you for exact change! ");
		} else if (moneyInserted < itemPrice) {
			System.out.println("That is not enough money :( ");
		}

		else if (moneyInserted == 20) {
			System.out.println(moneyInserted - itemPrice);
		}
//	
//			do { 
//				
//		}

		sc.close();
	}
}
