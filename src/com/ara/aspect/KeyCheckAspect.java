package com.ara.aspect;

import org.aspectj.lang.JoinPoint;

public class KeyCheckAspect {
	public void check(JoinPoint jp, Object key) {
		if((Integer) key <= 0) {
			throw new IllegalArgumentException("Invalid Key length/weak key generated");
		}
	}
}
