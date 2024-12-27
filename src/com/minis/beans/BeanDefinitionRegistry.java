package com.minis.beans;

/**
 * beanDefine
 */
public interface BeanDefinitionRegistry {
	void registerBeanDefinition(String name, BeanDefinition bd);
	void removeBeanDefinition(String name);
	BeanDefinition getBeanDefinition(String name);
	boolean containsBeanDefinition(String name);
}
