package com.gl.weekfour;

import java.util.Scanner;

/*
 * Create a basic addition program using method implementation:

1) Create a method performAddtion of return type int and accepts two integer arguments.

2) read two numbers from the user and call performAddtion method inside main method

3) Display the result.

 

Stub Code

import java.util.Scanner;

class Main {

//performAddition method 
public int performAddition(int num1, int num2) {

}

//main method
public static void main(String[] args) {

//create object of main class
Main main = new Main();
int num1,num2,result;

//take input of num1, num2


//call performAddition method and store result in a variable
result = main.performAddition(num1,num2);

//display the result.

}
}
Modifying the code to test GIT Demo
 */

public class PWWeek4CodingChallenge2 {
	
	public int performAddtion(int number1, int number2){
		
		return number1 + number2;
	}

	public static void main(String[] args) {
		
		PWWeek4CodingChallenge2 object = new PWWeek4CodingChallenge2();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		
		int number1 = input.nextInt();
		
		System.out.println("Enter the second number:");
		int number2 = input.nextInt();
		
		System.out.println("Sum of the two give numbers is: "+object.performAddtion(number1, number2));
	}

}
