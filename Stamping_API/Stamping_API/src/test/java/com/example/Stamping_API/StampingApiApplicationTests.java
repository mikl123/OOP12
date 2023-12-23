package com.example.Stamping_API;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class StampingApiApplicationTests {

	Sinature s1 = new Sinature(2, 5);
	Sinature s2 = new Sinature(2, 5);
	Sinature s3 = new Sinature(2, 5);
	Group g = new Group();
	
	@Test
	void contextLoads() {
	g.add_signature(s1);
	g.add_signature(s2);
	g.add_signature(s3);
	Visitor v = new Protocol1();
	org.junit.jupiter.api.Assertions.assertEquals(g.apply(v), 1);
	org.junit.jupiter.api.Assertions.assertEquals(s1.apply(v), 2);
	}

}
