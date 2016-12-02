import java.util.Scanner;

/**
 * 
 */

/**
 * @author a.middlestead
 * 
 * Student name: Abbey Middlestead
 * Teacher: Mr. Hardman
 * Assignment number: Assignment 5
 * Date last modified: 11/29/2016
 */
public class Arraysassignment {

	/**
	 * 
	 */
	public Arraysassignment() {
		// TODO Auto-generated constructor stub
		Scanner userInput = new Scanner(System.in);
		
		int[] myArray = {2, 5, 8, 6, 3};
		int index;
		int uservalue;
		
		//to iterate through an Array, we use a loop!
		//i is the index to find the array we are looking for
		//this will continue until, it is as long as the length
		//of an array 
		for(int i = 0; i < myArray.length; i++){
			
			//this will display all the values
			System.out.println(myArray[i] + "  ");
		}
	}	//this code gets the value you want to search from the user
		system.out.println();
		system.out.println("what value do you want the index of?");
		userValue = userInput.nextInt();
		
		//to search for something you have to look at every element 
		//of an array. this is accomplished by looping through 
		//all the element 
		for(int i = 0; i < myArray.length; i++){
			if(myArray[i]==userValue){
				index = i;
				
			}
			if(index == -1){
				System.out.println("this is not in the array!");
				else {
					System.out.println(userValue + "is at index " + index);
				}
				
			}	userInput.close();
			
		}

	
}
