import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		//create the scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter a 5 digit number
		System.out.print("Enter a 5 digit number: ");
		int number = input.nextInt();
		
		int firstDigit = number / 10000 % 10;
		int secondDigit = number / 1000 % 10;
		int thirdDigit = number / 100 % 10;
		int fourthDigit = number / 10 % 10;
		int fifthDigit = number % 10;
		
		System.out.println(firstDigit);
		System.out.println(secondDigit);
		System.out.println(thirdDigit);
		System.out.println(fourthDigit);
		System.out.println(fifthDigit);
		
		System.out.println();
		
		//convert the digits into strings
		String strDigit1 = Integer.toString(firstDigit);
		String strDigit2 = Integer.toString(secondDigit);
		String strDigit3 = Integer.toString(thirdDigit);
		String strDigit4 = Integer.toString(fourthDigit);
		String strDigit5 = Integer.toString(fifthDigit);
		
		String forward = strDigit1 + strDigit2 + strDigit3 + strDigit4 + strDigit5;
		String reverse = strDigit5 + strDigit4 + strDigit3 + strDigit2 + strDigit1;
		
		System.out.println(forward);
		System.out.println(reverse);
		
		int newForward = Integer.parseInt(forward);
		int newReverse = Integer.parseInt(reverse);
		
		if(newForward == newReverse)
		{
			System.out.println(newForward + " = " + newReverse + ", the number is a palindrome");
		}
		else
		{
			System.out.println(newForward + " != " + newReverse + ", the number is NOT a palindrome");
		}
		
	}

}
