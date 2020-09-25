package com.company;

public class Main {

    public static void main(String[] args) {
	int a = 10;
	int b = 2;
	int c = a / b;
	double d = (double) a / b;

		System.out.println(c);
		System.out.println(d);

		int e = a%b;
		System.out.println(e);

		if (a%2 ==0){
			System.out.println("A is even");
		}
		else System.out.println("A is odd");

		String f = String.valueOf(a);
		System.out.println(f);

		String g = "120";

		int h = Integer.valueOf(g);
		System.out.println(h+5);

		Integer k = 713;
		System.out.println(k.toString().length());
		int counter = 0;
		for (Integer i = 100000; i < 999999; i++) {
			String str = i.toString();
			int firstDigit = Integer.valueOf(str.charAt(0));
			int secondDigit = Integer.valueOf(str.charAt(1));
			int thirdDigit = Integer.valueOf(str.charAt(2));
			int rFirstDigit = Integer.valueOf(str.charAt(3));
			int rSecondDigit = Integer.valueOf(str.charAt(4));
			int rThirdDigit = Integer.valueOf(str.charAt(5));

			if (firstDigit + secondDigit + thirdDigit == rFirstDigit + rSecondDigit + rThirdDigit) {
				System.out.println(i + "Lucky");
				counter++;
			}
			
		}
		System.out.println(counter);
	}
}
