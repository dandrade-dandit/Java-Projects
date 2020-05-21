package advancedinharitance;

public class LambdaExpDemo2 {

	public static void main(String[] args) {
		Worker2 obj = (i, t)->{ 
			
	    	System.out.println("I clean " + i + " in time " + t + " hours.");
	    	
		};
	
		obj.work("clothes", 2);

	}

}
