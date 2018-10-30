package spi;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * �����¼��ļ����࣬������Ϊspring������bean ͬʱ��Ҫʵ��ApplicationListener�ӿڣ���дonApplicationEvent����
 * @author xupc
 *	����5:17:05
 */
public class EmailNotifier implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent evt) {
		if(evt instanceof EmailEvent){
			EmailEvent emailEvent = (EmailEvent)evt;
			System.out.println("�ʼ���ַ��"+emailEvent.getAddress());
			System.out.println("�ʼ����ݣ�"+emailEvent.getText());
		}else{
			System.out.println("�����¼���"+evt);
		}
	}

}
