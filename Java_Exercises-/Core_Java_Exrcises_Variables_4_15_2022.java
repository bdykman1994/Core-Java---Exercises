package coreJavaEcercisesVariables;

public class main {

	public static void main(String[] args) {
//		Write a program that declares 2 integer variables, assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result.	
	
	int first = 1;
	int second = 2;
	int sum = first + second;
	System.out.println("Write a program that declares 2 integer variables, assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result.");
	System.out.println(sum);
//	Write a program that declares 2 double variables, assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.

	
	double third = 1.1;
	double fourth = 2.2;
	double sum2 = third + fourth;
	System.out.println("\nWrite a program that declares 2 double variables, assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.");
	System.out.println(sum2);
//	Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?

	
	int fifth = 1;
	double sixth = 2.2;
	double sum3 = fifth + sixth;
	System.out.println("\nWrite a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?");
	System.out.println(sum3);
	System.out.println("The variable type will be a double");
	
	int seventh = 10;
	int eighth = 2;
	int sum4 = seventh / eighth;
	
	double ninth = 10;
	int tenth =2;
    double sum5 = ninth / tenth ;
	
//    Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?

    
	System.out.println("\nWrite a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?");
	System.out.println(sum4);
	System.out.println("You need to change the variable to a double if you do an operation with a double and an int.");
	
//	Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller. Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.

	
	double eleven = 10;
	double twelve = 2; 
	double sum6 = eleven / twelve;
	System.out.println("\nWrite a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller. Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.");
	System.out.println(sum6);
	System.out.println("You cant decare a variable of two double as an int.");
	
//Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q. Print q again.
	int x = 5;
	int y = 6;
	int q = x/y;
	double q2 = x/y;
	System.out.println("\nWrite a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q. Print q again.");
	System.out.println(q);
	System.out.println(q2);
	
//	Write a program that declares a named constant and uses it in a calculation. Print the result.
	int thirteen = 1;
	int fourteen = 2;
	final int fifteen = thirteen + fourteen;
	System.out.println("\nWrite a program that declares a named constant and uses it in a calculation. Print the result.");
	System.out.println(fifteen);
	
//	Write a program where you create 3 variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 4 items of the second product, and 2 items of the third product. Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to 2 decimal places.
	double coffee = 5.99;
	double cappuccino = 6.99;
	double espresso = 7.99;
	double subtotal1 = (3 * coffee) + (4 * cappuccino) + (2* espresso);	 
	final double salesTax =.7;
	double totalSale = subtotal1 * salesTax;
	System.out.println("Write a program where you create 3 variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 4 items of the second product, and 2 items of the third product. Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to 2 decimal places.");
	System.out.print("$" + Math.round(totalSale));
	
	
	
	
	}

}
