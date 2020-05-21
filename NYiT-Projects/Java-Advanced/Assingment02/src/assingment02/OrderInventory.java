package assingment02;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public interface OrderInventory {
	static final Map<Integer, Double> ORDER_INVENTORY = 
		    Collections.unmodifiableMap(new HashMap<Integer, Double>() {/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

			{ 
		        put(111, 0.89);
		        put(222, 1.47);
		        put(333, 2.43);
		        put(444, 5.99);
		    }});
}
