package spi;

import java.lang.reflect.Field;

import org.springframework.beans.factory.FactoryBean;

public class GetField implements FactoryBean<Object>{
	
	private String targetClass;
	private String targetField;
 
	@Override
	public Object getObject() throws Exception {
		Class<?> clazz = Class.forName(targetClass);
		Field field = clazz.getField(targetField);
		return field.get(null);
	}

	@Override
	public Class<?> getObjectType() {
		return Object.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	public String getTargetClass() {
		return targetClass;
	}

	public void setTargetClass(String targetClass) {
		this.targetClass = targetClass;
	}

	public String getTargetField() {
		return targetField;
	}

	public void setTargetField(String targetField) {
		this.targetField = targetField;
	}


}