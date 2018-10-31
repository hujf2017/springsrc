package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spi.GetContextViaBean;

public class Snippet {
	@Test
	public  void test4() {
	         ApplicationContext ctx = new ClassPathXmlApplicationContext("springAOP.xml");
	         GetContextViaBean bean = ctx.getBean("getContextViaBean", GetContextViaBean.class);
	        bean.SayHi("ËïÎò¿Õ");
	    }
}

