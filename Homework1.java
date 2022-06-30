
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Homework1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		String playAgain;
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+                                                                           +");
		System.out.println("+ The purpose of this program is to have the user enter an Integer value,   +");
		System.out.println("+ and the resulting output will be an array with that amount of characters. +");
		System.out.println("+ Working on applying a sorting algorithm to sift through the data, will    +");
		System.out.println("+ be looking to utilize 5 different algorithms. They will be the following: +");
		System.out.println("+ Merge Sort, Heap Sort, Insertion Sort, Selection Sort and Bubble Sort.    +");
		System.out.println("+                                                                           +");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		
		do{
		int integer;
		System.out.println("Please Enter an Integer value: ");
		integer = stdIn.nextInt();

		helper(integer);
			System.out.println("");
	        System.out.println("Do you wish to play again [y, n] : ");
	        playAgain = stdIn.next();
	      } while ((playAgain.equalsIgnoreCase("y") || !playAgain.equalsIgnoreCase("n")));
		
		// Ending message
		System.out.print("The game is over!");
		stdIn.close();
	}
	
	
	// purpose of the function is to create an array that generates random characters according to the number that was entered.
	
	
	public static void helper(int integer)
	  {
		   char[] randomLetters = new char[integer]; 
		   // random letter values are generated
		   Random rnd = new Random();
		   for (int i = 0; i < randomLetters.length; i++) {
			   randomLetters[i] = (char) (rnd.nextInt(26) + 'a');
		   }
		   
		   // minimum location of the character
		   int minlocation = randomLetters[0];
		   int index = 0;
		   for (int i = 0; i <randomLetters.length; i++) {
			   if (minlocation > randomLetters [i]) {
				   minlocation = randomLetters [i];
				   index = i;
			   }
		   }
		   
		   // swap the letters between the initial point and the point they should be at
		   char temp = randomLetters[0];
		   randomLetters[0] = randomLetters[index];
		   randomLetters[index] = temp;
		   
		   // turn array to string
		   String letters = Arrays.toString(randomLetters);
		   
		   // check for vowels
		   long count = 0;
		   for (int i = 0; i < randomLetters.length; i++) {
			   char c = randomLetters [i];
			   if (c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u'){
			   count++;
			   }
		   }
		   
		   
		   //string length
		   int leg = randomLetters.length;
		   
		   //print the Length of string
		   System.out.println("Letters array: " + letters);
		   
		   // calling Merge Sort
		   
		   // calling Heap Sort
		   
		   // calling Insertion Sort
		   
		   // calling Bubble Sort
		   
		   // calling selection sort
		   selectionSort(randomLetters, leg);
		   System.out.println("Selection Sort Array: " + Arrays.toString(randomLetters));
		   
		   // Length of array, Character and Vowel Statistics
		   System.out.println("Length of Array: [" + leg + "]");
		   System.out.println("Characters: "+ leg + " Vowels: "+ count);
		   if (!(count == 0)) {
			   long charPerVowel = leg/count;
			   System.out.println("Amount of characters per vowel: "+ charPerVowel);
		   }
		   
		   
		   
	}
	
	// create a function that will sort the array of characters using selection sort
	// Selection Sort sorts the array by repeatedly finding the minimum element
	// from the unsorted part and putting it at the beginning of the array. 
	// Divides the original array into 2 different arrays, an unsorted and sorted sub-array.
	// In every iteration of the selection sort, the minimum element of the unsorted sub-array 
	// is picked and moved to the sorted sub-array
	
	
	public static void selectionSort(char arr[], int n) {
		
		
		for (int i = 0; i < n-1; i++) {
			
			int min_index = i; // minimum index equals i 
			char atPositionOfI = arr[i]; // declaring a variable for the value in the array at position i
			String a = String.valueOf(atPositionOfI); // String.valueOf will return the argument that was passed. In this case, the character value in the array. 
			
			for (int j = i + 1; j < n; j++) {
				
				String b = String.valueOf(arr[j]); // will return the a character value of j in the array
				if (b.compareTo(a) < 0) {
					
					a = String.valueOf(arr[j]);
					min_index = j;
				}
			}
			
			if (min_index != i ) {
				
				char temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;
			}
		}
		
	}
	
}

