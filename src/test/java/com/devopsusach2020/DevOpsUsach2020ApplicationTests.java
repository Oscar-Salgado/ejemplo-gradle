package com.devopsusach2020;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevOpsUsach2020ApplicationTests {

	@Test
	void contextLoads() {
		String obj1="Diplo";
      String obj2="Mado";
      assertEquals(obj1,obj2);
	}

}
