package com.simplilearn.app.learning_maven;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Date date = new Date();
    	System.out.println("Date & Time on server : "+date);
    	Greeter greeter = new Greeter();
    	System.out.println(greeter.sayHi());
    	System.out.println(greeter.sayHello());
    	System.out.println(greeter.sayTodaysGreeting());
        System.out.println( "Hello World!" );
    }
}
