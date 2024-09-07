package methods;

import java.util.Scanner;

import items.Item;

public class Test {
	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Laptop Amount: ");
		int laptopQuantity = scanner.nextInt();
		System.out.print("Enter Mouse Amount: ");
		int mouseQuantity = scanner.nextInt();
		System.out.print("Enter Desktop Amount: ");
		int desktopQuantity = scanner.nextInt();
		System.out.print("Enter LCDScreen Amount: ");
		int lcdScreenQuantity = scanner.nextInt();

		// Add order to Calc
		calculation.addItems(new Item("Laptop", 60, 50, 50, 6.5), laptopQuantity);
		calculation.addItems(new Item("Mouse", 30, 30, 20, 0.2), mouseQuantity);
		calculation.addItems(new Item("Desktop", 100, 150, 50, 20), desktopQuantity);
		calculation.addItems(new Item("LCD Screen", 120, 140, 80, 2.6), lcdScreenQuantity);

		scanner.close();

		// Add product details
		calculation.addItems(new Item("Laptop", 60, 50, 50, 6.5), 1);
		calculation.addItems(new Item("Mouse", 30, 30, 20, 0.2), 1);
		calculation.addItems(new Item("Desktop", 100, 150, 50, 20), 1);
		calculation.addItems(new Item("LCD Screen", 120, 140, 80, 2.6), 1);

		// Print
		calculation.printItemInfo();
		calculation.calculateBestShipping();
		calculation.printShippingPrice();
		{
		}
	}

}

//Ivan Andres Bustillo 29879783