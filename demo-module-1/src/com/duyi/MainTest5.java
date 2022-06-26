package com.duyi;

import java.lang.annotation.*;


@MyAnnotation
public class MainTest5 {
	@Override
	@MyAnnotation(age = 22)
	public String toString() {
		
		return super.toString();
	}
	public static void main(String[] args) {
		System.out.println("I am test 5!");
		System.out.println("I am test 5!");
		System.out.println("I am test 5!");
		
	}
}
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@interface MyAnnotation {
	int age() default 18;
	String name() default "lzp";
}
