import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.task1.ATM;
import com.example.task_2_done.Group;
import com.example.task_2_done.Signature;

public class task1 {
	@Test
	void contextLoads() {
      ATM atm = new ATM();
     Assertions.assertEquals(atm.process(234), 2);
	}
    	@Test
	void contextLoads1() {
      ATM atm = new ATM();
     Assertions.assertEquals(atm.process(34), 0);
	}

    
}
