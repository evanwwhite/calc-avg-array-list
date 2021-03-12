//Evan White
//1.  TODO import the ArrayList package
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class ArrayList3EW
{
	public static void main(String[] args) 
	{
		System.out.println("ArrayList program #3\n");
		//2. TODO   declare an ArrayList that holds only <Integer> objects
		ArrayList <Integer> list = new ArrayList <Integer>();
		
		//3.  add 90 to your list      
        list.add(90);
		      
		//4. Call the calculateAverage method, sending it the ArrayList 
        calculateAverage(list);
		
	    //6. Add 85 to your list of grades.  Call the calculateAverage method       
        list.add(85);  
        
	    calculateAverage(list);
	    //7. Add 75 to your list of grades.  Call the calculateAverage method              
        list.add(75);
        
        calculateAverage(list);
	}
			
   public static void calculateAverage(ArrayList <Integer> list)
   {
      //5.  TODO  calculate the average 
	  //             declare and initialize an accumulator
	  //             accumulate the elements using a loop and the get() method
	  //             divide by size(), be sure to avoid integer division
	  //          print the average
	  double accum = 0;
	  double counter = 0;
	  for(int w = 0; w < list.size(); w++)
	  {
		  accum += list.get(w);
		  counter = accum/list.size();
	  }
	  System.out.println(list);
	  
	  System.out.println(counter);
	  
  }
}
/*
[90]
90.0
[90, 85]
87.5
[90, 85, 75]
83.33333333333333
*/
