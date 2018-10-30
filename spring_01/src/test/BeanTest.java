package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Interface.Person;

public class BeanTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springAOP.xml");
        Person p = ctx.getBean("chinese", Person.class);
        p.useAxe();
    }
}