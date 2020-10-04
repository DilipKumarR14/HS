package com.dilip.annotationbased.SpringAnnotationBased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SnapDragon implements MobileProcessor {

	/**
	 * if we write @primary on the class, it will be sonsidered first
	 */
	public void processor() {
		System.out.println("SnapDragon Fast processor");
	}

}
