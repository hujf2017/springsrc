package test;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ���ʻ�����
 * @author xupc
 *	����9:03:14
 */
public class beanguojihua {
	public static void main(String args[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springAOP.xml");
        
        String str1 = ctx.getMessage("str1", new String[]{"�����"},    //ͨ��bean����getMessage����
                Locale.getDefault(Locale.Category.FORMAT));
        String str2 = ctx.getMessage("str2", new Object[]{new Date()}, 
                Locale.getDefault(Locale.Category.FORMAT));
        System.out.println(str1);
        System.out.println(str2);
        
        String str3 = ctx.getMessage("str1", new String[]{"�����"}, 
                Locale.US);
        String str4 = ctx.getMessage("str2", new Object[]{new Date()}, 
                Locale.US);
        System.out.println(str3);
        System.out.println(str4);
    }
}
