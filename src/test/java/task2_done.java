
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.task_2_done.Group;
import com.example.task_2_done.Signature;



public class task2_done {
    static int a = 10;
    static void decrement(){
        a = a-1;
    }
	@Test
	void contextLoads() {
        Signature s = new Signature<>((value) -> {decrement();});
        s.apply(1);
        Assertions.assertEquals(a, 9);
        a = 10;
	}
    @Test
	void contextLoads1() {
        Group g = new Group<>();
        Signature s = new Signature<>((value) -> {decrement();});
        Signature s1 = new Signature<>((value) -> {decrement();});
        g.addTask(s).addTask(s1);
        g.apply(1);
        Assertions.assertEquals(a, 8);
        a = 10;
	}

}
