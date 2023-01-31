package com.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springdemo.pojo.Bike;
import com.training.springdemo.pojo.Car;
import com.training.springdemo.pojo.Tyre;
import com.training.springdemo.pojo.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context =  new ClassPathXmlApplicationContext("Spring.xml");
    	

    	
    	System.out.println(context);
    	
    	
        Vehicle v = (Vehicle)context.getBean("person");
        v.drive();
    	
    	Tyre t = (Tyre) context.getBean("tyre");
    	
    	System.out.println(t);
    	
        System.out.println( "Hello World!" );
    }
}
