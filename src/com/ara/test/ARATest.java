package com.ara.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ara.beans.KeyGenerator;

public class ARATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ara/common/application-context.xml");
		/*KeyGenerator keyGenerator = context.getBean("keyGenerator", KeyGenerator.class);*/
		KeyGenerator keyGenerator = context.getBean("keyGenerator2", KeyGenerator.class);
		
		int /*key = keyGenerator.generateKey(10);
		System.out.println("Key :"+key);*/
		
		key = keyGenerator.generateKey(7);
		System.out.println("Key :"+key);
		
	}
}

	