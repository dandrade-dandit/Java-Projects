//Create your own OrderException class that stores one of the messages; save the file as OrderException.java.
package assingment02;

public class OrderException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderException(int msgNum) {
		super(OrderMessages.error_msgs[msgNum]);
	}
}
