package com.dilip.annotationbased.SpringAnnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    	
        Samsung samsung=ac.getBean(Samsung.class);
        samsung.config();
        
        /** if we dont need Bean to be speicifed in AppConfig, then we can add 
         * @Component to the classes that we need and add 
         * @ComponentScan and give the basepackages in AppConfig **/
        
        /**
    	 * if we write @primary on the class, it will be considered first
    	 */

        /**
         * if we specify the @qualifier in appconfig file and provide name as argument,
         *  then it will be considered first
         */
        
    }
}
