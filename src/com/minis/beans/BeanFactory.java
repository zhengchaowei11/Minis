package com.minis.beans;

/**
 * 这个 BeanFactory 不生产bean 
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
	boolean containsBean(String name);
	//void registerBean(String beanName, Object obj);
	boolean isSingleton(String name);
	boolean isPrototype(String name);
	Class<?> getType(String name);

}
