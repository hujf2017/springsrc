package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Interface.Person;
import spi.EmailEvent;
import spi.EmailNotifier;

public class BeanTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springAOP.xml");
        Person p = ctx.getBean("chinese", Person.class);
        p.useAxe();
        
        EmailEvent ele = new EmailEvent("test", "test@test.com", "this is a test");
        ctx.publishEvent(ele);
    }
}