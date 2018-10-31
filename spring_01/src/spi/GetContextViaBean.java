package spi;

import java.util.Locale;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/**
 * 
 * @author xupc
 *	上午9:09:21
 */
public class GetContextViaBean implements ApplicationContextAware {
    private ApplicationContext ctx;   //创建一个bean
    @Override
    public void setApplicationContext(ApplicationContext ctx)   //重写
            throws BeansException {
        this.ctx = ctx;
    }
    public void SayHi(String name) {
        System.out.println(ctx.getMessage("str1", new String[]{name}, Locale.US));
    }

}