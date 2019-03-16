import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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

		while (change >= 10) {
			bill10Count++;
			change = change - 10;

		}
		while (change >= 5) {
			bill5Count++;
			change = change - 5;
		}
		while (change >= 1) {
			bill1Count++;
			change = change - 1;
		}
		while (change >= 0.25) {
			coin25Count++;
			change = change - 0.25;
		}
		while (change >= 0.10) {
			coin10Count++;
			change = change - 0.10;
		}
		while (change >= 0.05) {
			coin05Count++;
			change = change - 0.05;
		}
		while (change >= 0.01) {
			coin01Count++;
			change = change - 0.01;
		}
		if (bill10Count > 0) {
			System.out.println("You get one 10 dollar bill");
		}
		if (bill5Count > 0) {
			System.out.println("You get one 5 dollar bill");
		}
		if (bill1Count > 0) {
			System.out.println("You get " + bill1Count + " dollar bills");
		}
		if (coin25Count > 0) {
			System.out.println("You get " + coin25Count + " quarters");
		}

		if (coin10Count > 0) {
			System.out.println("You get " + coin10Count + " dimes");
		}

		if (coin05Count > 0) {
			System.out.println("You get " + coin05Count + " nickles");
		}

		if (coin01Count > 0) {
			System.out.println("You get " + coin01Count + " pennies");
		}

		sc.close();
	}
}
