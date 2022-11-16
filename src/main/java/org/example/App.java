package org.example;

import org.example.Model.Car;
import org.example.ner.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
           /* Coach coach=context.getBean("myCoach",Coach.class);

        coach.train();
        context.close();*/
    /*  Person coach=context.getBean("myPerson", Person.class);

        coach.callYourCaoch();
        System.out.println(coach.getName()+" " +coach.getAge());
        context.close();*/
        Car car=context.getBean("car", Car.class);
        Car car1=context.getBean("car", Car.class);

        System.out.println(car1==car);
        System.out.println(car);
        System.out.println(car1);
        context.close();
    }
}
