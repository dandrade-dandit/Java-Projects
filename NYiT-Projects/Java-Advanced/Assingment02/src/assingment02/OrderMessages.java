// Create a class that stores an array of usable error messages; save the file as OrderMessages.java.
//The item number ordered is not numeric, too low (less than 0), or too high (more than 9999).
//The quantity is not numeric, too low (less than 1), or too high (more than 12).
//The item number is not a currently valid item.

package assingment02;

public abstract class OrderMessages {
	public final static String[] error_msgs = { 
			"The item number ordered is not numeric.", 					//Error Code 0
			"The item number ordered is too low (less than 0).", 		//Error Code 1
			"The item number ordered is too high (more than 9999).", 	//Error Code 2
			"The quantity is not numeric.",								//Error Code 3
			"The quantity is too low (less than 1).", 					//Error Code 4
			"The quantity is too high (more than 12).",					//Error Code 4
			"The item number is not a currently valid item.", 			//Error Code 5
			"Item number does not exist.", 								//Error Code 6
			null};														//Error Code 7 (Null Error).
}
