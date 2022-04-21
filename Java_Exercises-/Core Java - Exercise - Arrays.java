package coreJavaEcercisesVariables;
import java.io.*;
import java.util.*;
public class gucciMain {

	public static void main(String[] args) {
//		Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.
	
		int [] myArray = {1,2,3};
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Question 1 " + myArray[i]);
		}
		
				
		
//		Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
				int [] myArray2= {13, 5, 7, 68, 2};
	
		int mid = myArray2[myArray2.length /2];
		System.out.println("Questionn 2 " + mid);
	

//		Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.

//		String [] myArray = {"red", "green", "blue", "yellow"};
//		System.out.println(myArray.length + " Original Array");
//		String [] cArray = myArray.clone();
//		System.out.println(Arrays.toString(cArray) + " Values of Clone Array");
//		
//		Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.

//		int [] myArray = {1, 2, 3, 4, 5};
//		System.out.println(myArray[myArray.length -1] +"," + myArray[0]);
//		System.out.println(myArray[myArray.length]);
//		System.out.println(myArray[5]);
//	
//		Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
		
//		int [] arr = new int[5];
//		int i;
//		
//		for (i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//		}
//		System.out.println(Arrays.toString(arr));

//		Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.

//		int [] arr = new int[5];
//		int i;
//		
//		for (i = 0; i < arr.length; i++) {
//			arr[i] = (i + 1) * 2;
//		}
//		System.out.println(Arrays.toString(arr));


//		Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.

		
//        int [] arr = {1, 2, 3, 4, 5};
//		int mid = arr[arr.length /2];
//		int i;
//		
//		for (i = 0; i < arr.length; i++) {
//			if(i != mid) {
//				System.out.println(i);
//			}
//		
//		};
//
////		Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
//
//		
////	ArrayList<Integer> arrList = new ArrayList<Integer>();
////	int mid = arrList.size();
////	arrList.add(1);
////	arrList.add(2);
////	arrList.add(3);
////	arrList.add(4);
////	arrList.add(5);
////	
////	
////	System.out.println(arrList.size() + " original");
////	
////	Collections.swap(arrList, 0, arrList.size()/2);
////	System.out.println(arrList + " Swapped" );
////	};
//	
//			
//		
//		
//		
//		Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, print the smallest and the largest element of the array. The output will look like the following:
//		Array in ascending order: 0, 1, 2, 4, 9, 13
//
//		The smallest number is 0
//
//		The biggest number is 13
		
//		int [] arr = {4, 2, 9, 13, 1, 0};
//		int i;
//	
//		for (i = 0; i < arr.length; i++);   
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

//
//		Create an array that includes an integer, 3 strings, and 1 double. Print the array.
//	}

//		Object[] arr = new Object[]{1,"a","b","c", 1.1};		
//		System.out.println(Arrays.toString(arr));
//		
	}
}
		
