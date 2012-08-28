package com.neev.java.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogExpression {

	public static void main(String arg[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean flag = true;
		int base, num;

		while (flag) {

			System.out.print("Enter an Integer Base(>1): ");

			try {
				base = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Please enter integer only.");
				continue;
			}

			if (base > 1) {

				boolean flag1 = true;

				while (flag1) {

					System.out.print("Please Enter a Positive Integer: ");

					try {
						num = Integer.parseInt(br.readLine());
					} catch (NumberFormatException e) {
						System.out.println("Please enter integer only.");
						continue;
					}

					if (num <= 0) {
						flag1 = true;
						System.out.println("Number is not positive.");
					} else {
						flag1 = false;
						Log.calculateLog(base, num);
					}
				}

			} else {
				System.out.println("You have entered base less than 1.");
				flag = false;
			}
		}
	}
}
