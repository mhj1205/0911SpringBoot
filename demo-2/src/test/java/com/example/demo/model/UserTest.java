package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class UserTest {
	private static final Logger logger = LogManager.getLogger(UserTest.class);
	
	User user = null;
	
	public UserTest() {
		user = new User("001", "lee", "lee@a.com");
	}

	@Test
	void testToString() {
		System.out.println(user);
	}
	
	@Test
	public void testIsValid() {
		User userDTO = new User();
		user.setName("hong");
		userDTO.setEmail("hong@example.com");

		if (userDTO.isValid()) {
			logger.info("UserDTO is valid");
		} else {
			logger.error("UserDTO is not valid");
		}
	}
	

    @Test
    public void testIsValid2() {
        User user = new User();
        user.setName("hong");
        user.setEmail("hong@example.com");

        assertTrue(user.isValid());
    }
}