package spi;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 创建事件的监听类，必须作为spring的容器bean 同时需要实现ApplicationListener接口，重写onApplicationEvent方法
 * @author xupc
 *	下午5:17:05
 */
public class EmailNotifier implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent evt) {
		if(evt instanceof EmailEvent){
			EmailEvent emailEvent = (EmailEvent)evt;
			System.out.println("邮件地址："+emailEvent.getAddress());
			System.out.println("邮件内容："+emailEvent.getText());
		}else{
			System.out.println("其它事件："+evt);
		}
	}

}
