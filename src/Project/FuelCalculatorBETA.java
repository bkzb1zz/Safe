package Project;

import java.util.Scanner;

public class FuelCalculatorBETA {

	public static void main(String[] args) {

		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.print("Fuel calculator(ii) or distance calculator(i)");
			String choice = input.nextLine();
			float km = 0;
			float fuel = 0;
			float fuelprice = 0;
			float km1 = 0;
			float calculator = fuel / (km / 100);
			if (choice.equals("ii")) {
				System.out.print("Fuel : ");
				fuel = input.nextFloat();
				System.out.print("Km : ");
				km = input.nextFloat();
				calculator = fuel / (km / 100);
				System.out.println("Fuel Conpsumtion for 100km.: " + calculator);
				System.out.print("Travel distance: ");
				km1 = input.nextFloat();
				System.out.print("Fuel price: ");
				fuelprice = input.nextFloat();
				float distanceprice = (km1 / 100) * calculator * fuelprice;
				System.out.println("Distance price: " + distanceprice + "leva");
			} else if (choice.equals("i")) {
				System.out.print("Fuel Conpsuption: ");
				float fc = input.nextFloat();
				System.out.print("Fuel price: ");
				fuelprice = input.nextFloat();
				System.out.print("Distance: ");
				km1 = input.nextFloat();
				float km2 = (km1/100);
				float calculator2 = fc*fuelprice*km2;
				System.out.println("Distance price: " + calculator2 + "leva");
			}

		}

	}

}
