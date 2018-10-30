package spi;

import org.springframework.context.ApplicationEvent;

/**
 * �¼��࣬����̳�ApplicationEvent���Ƿ�ΪSpring������bean����ν��
 * @author xupc
 *	����5:13:24
 */
public class EmailEvent extends ApplicationEvent{
	private String address;
	private String text;

		/**
		 * g���췽��
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
