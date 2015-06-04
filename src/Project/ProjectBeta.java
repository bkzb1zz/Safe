package Project;

import java.util.Scanner;

public class ProjectBeta {

	public static void main(String[] args) {

		Scanner userinput = new Scanner(System.in);

		int[] safe = new int[99999];
		int cashin = 0;
		int zaem = 0;
		int[] p = new int[99999];
		int f = 0;
		int j = 0;
		int aa = 0;
		int aa2 = 0;
		int i = 0;
		int k = 0;
		int l = 0;
		int h = 0;
		int u = 0;
		int[] array = safe;
		int minIndex = 0;

		while (true) {
			int m = 0;
			int y = 0;
			int x = 0;

			System.out.print("Draw, Deposit or Balance Check: ");
			String g = userinput.next();
			// ========================================================================================
			if (g.equals("deposit") || g.equals("Deposit") || g.equals("d")
					|| g.equals("D")) {

				for (f = l; f == l; f++) {
					Scanner input2 = new Scanner(System.in);
					System.out.print("Insert amount you would like to deposit: ");
					h = input2.nextInt();
				}
				l++;
				if (h < 0) {
					int z = h;
					// -1- tsikul za namirane na nai-golqma stoinost ot
					// masiv-------------------------
					for (int b = 0; b < safe.length; b++) {
						for (i = 0; i < safe.length; i++) {
							int min = 999999999;
							minIndex = 0;
							for (j = i; j < safe.length; j++) {
								if (min > safe[j]) {
									min = safe[j];
									minIndex = j;
								}
							}
							int swap = safe[minIndex];
							safe[minIndex] = safe[i];
							safe[i] = swap;
							k = safe[i];

						}
						safe[minIndex] = 0;

						if (k > 0) {
							y = h * -1;

							x = x + k;
							k = 0;

							if (x > y) {
								array[u] = x - y;
								System.out
										.println("Money Loan: "
												+ z
												* -1
												+ "\n"
												+ "Amount returned in safe: "
												+ array[u]);
								u++;

								break;
							}
						}
					}

					if (x < y) {
						System.out
								.println("Not enought balance"
										+ "\n"
										+ "Safe amount has been withdrawed for loan: "
										+ x + "\n" + "Remaining loan: " + (y - x));
					}

					x = 0;

					// -----
				} else if (h >= 0) {

					array[u] = h;
					System.out.println(array[u]);
					if (u != 0) {
						System.out.println(array[u - 1]);
					}
					if (u > 1) {
						System.out.println(array[u - 2]);
					}
					u++;

				}

				// ===================================================================================================
			} else if (g.equals("draw") || g.equals("Draw")) {

				for (i = 0; i < safe.length; i++) {
					int min = 999999999;
					minIndex = 0;
					for (j = i; j < safe.length; j++) {
						if (min > safe[j]) {
							min = safe[j];
							minIndex = j;
						}
					}
					int swap = safe[minIndex];
					safe[minIndex] = safe[i];
					safe[i] = swap;
					k = safe[i];

					// }if(k == 0){
					// System.out.println("No money in balance");
				}
				safe[minIndex] = 0;
				System.out.println("You have drawed: " + k);

				// ======================================================================

			}

		}
	}

}
