package Project;

import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {


		Scanner inputChoise = new Scanner(System.in);
		int cashin = 0;
		int safe = 0;
		int safe2;
		int[] safeM = null;
		
		while (true) {
			
			System.out.print("draw or deposit: ");
			String g = inputChoise.next();
			if (g.equals("deposit")) {
				System.out.print("enter fee: ");
				cashin = inputChoise.nextInt();
				safe += cashin;
				System.out.print("balance: " + safe + "\n");
				for (int i = 0; i < 100; i++) {
					safeM[i] = safe;
					System.out.println(safeM[i]);
				}
				
			} else if (g.equals("draw")) {
				System.out.print("enter fee: ");
				int cashout = inputChoise.nextInt();
				safe -= cashout;
				System.out.print("balance: " + safe + "\n");
				
			}
			
			
		}

	}

}
