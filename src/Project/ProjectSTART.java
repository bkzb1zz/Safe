package Project;

import java.util.Scanner;

public class ProjectSTART {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int safe[] = new int[9999999];
		int safe2 = 0;
		int counter = -1;
		int counter2 = -1;
		while (true) {
			System.out.print("\n" + "Draw, Deposit or Balance: ");
			String g = input.next();
			if (g.equalsIgnoreCase("deposit") || g.equalsIgnoreCase("d")) {
				counter++;
				System.out.print("Enter amount: ");
				safe2 = input.nextInt();
				if (safe2 <= 0) {
					System.out
							.print("You cannot insert 0 or below money in safe");
					counter--;
				}
				for (int j = counter; j > counter2;) {
					safe[j] = safe2;
					counter2++;
				}
				for (int i = 0; i < (counter + 1); i++) {
					long min = 999999999999999999L;
					int minIndex = 0;
					for (int j = i; j < (counter + 1); j++) {
						if (min > safe[j]) {
							min = safe[j];
							minIndex = j;
						}
					}
					int swap = safe[minIndex];
					safe[minIndex] = safe[i];
					safe[i] = swap;
				}
			}
			if (g.equalsIgnoreCase("balance")) {
				if (counter == -1) {
					System.out.println("No money in balance");
				} else {
					System.out.print("Current balance: ");
					for (int i = 0; i <= counter; i++) {
						System.out.print(safe[i] + ",");
					}
					System.out.println();
				}
			}
			if (g.equalsIgnoreCase("draw")) {
				counter--;
				counter2--;
				if (counter == -2) {
					counter++;
					counter2++;
					System.out.println("No money in balance");
				} else if (counter > -2) {
					System.out.println("You have drawed: " + safe[counter + 1]);
				}
			}
		}
	}
}
