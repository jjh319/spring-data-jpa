package org.zerock.myapp;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;


@Log4j2
@NoArgsConstructor

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

@SpringBootTest
class QuickstartCh05ApplicationTests {


	@BeforeAll
	void beforeAll() {
		log.trace("beforeAll() invoked.");

	} // beforeAll

	@Test
	void contextLoads() {
		log.trace("contextLoads() invoked.");

	} // contextLoads

} // end class
