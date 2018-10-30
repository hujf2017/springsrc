package spi;

import org.springframework.context.ApplicationEvent;

/**
 * 事件类，必须继承ApplicationEvent，是否为Spring容器的bean无所谓，
 * @author xupc
 *	下午5:13:24
 */
public class EmailEvent extends ApplicationEvent{
	private String address;
	private String text;

		/**
		 * g构造方法
		 * @param source
		 */
	public EmailEvent(Object source) {
		super(source);
	}
	
	public String getAddress() {
		return address;
	}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public EmailEvent(Object source,String address,String text){
			super(source);
			 this.address =  address;
		     this.text = text;
		}	
		

	
	

}
