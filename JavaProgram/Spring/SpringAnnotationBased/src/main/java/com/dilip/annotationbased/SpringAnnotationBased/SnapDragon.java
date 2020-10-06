package com.dilip.annotationbased.SpringAnnotationBased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	/**
	 * if we write @primary on the class, it will be considered first
	 */
	public void processor() {
		System.out.println("SnapDragon Fast processor");
	}

}
