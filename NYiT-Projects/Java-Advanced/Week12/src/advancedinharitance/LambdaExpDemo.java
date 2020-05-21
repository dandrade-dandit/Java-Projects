package advancedinharitance;

public class LambdaExpDemo {
	
	 public static void main(String[] args) {
		 Worker obj = ()->{ 
				
		    	System.out.println("I clean clothes.");
		    	
		};
		
		obj.work();
	}	
}
