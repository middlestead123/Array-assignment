import java.util.Scanner;

/**
 * 
 */

/**
 * @author a.middlestead
 * Student name: Abbey Middlestead
 * Teacher: Mr. Hardman
 * Assignment number: Assignment number 5 part 2
 * date last modified: 11/30/2016
 */
public class Arrayassignmentpart2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int[] myArray = {2, 4, 7, 9, 3, 8, 10, 6, 5, 12};
		int index = -1;
		int userValue;
		int minimum;
		
		//to iterate through an Array, we use a loop!
		//i is the current index we are looking for 
		//it will continue until it is as large as the length
		//of an Array
		for(int i = 0; i < myArray.length; i++);
		
		//this will display all the values
		System.out.println(myArray[i] + "  ");
	}
	//this code gets you the value you want to search from the user
	system.out.println();
	syste.out.println("what value do you want the index for?");
	userVlaue = userInput.nextInt();
	
	//to search for something you have to look at every element
	//of an Array. this is accomplished by  looping through
	//all elements
	for(int i = 0; i < myArray.length; i++){
		if(myArray[i]==userValue){
			index = -1;
		}
	}	if(index == -1){
			System.out.println("this is not in the Array!");
			else {
				System.out.println(userValue + "is at index" + index);
				
				/**
				 * finding the minimum of the Array
				 * 
				 */
				
				minimum = myArray[0];
				
				//find the minimum value of the Array, we have to
				//search through every element of the Array and see if
				//the current value is smaller then the previous value 
				
				for(int i = 0; i < myArray.length; i++){
					
					//check if the current element is less then minimum
					if(myArray[i] < minimum){
						
					//if yes, change minimum to the current element
						minimum = myArray[i];
					}
				}	System.out.println("the minimum value is" + minimum);
				
			}	userInput.close();
	}		
	
	
}
