package com.minis.beans.factory;

import java.util.Map;

import com.minis.beans.BeansException;

/**
 * ListableBeanFactory 是 Spring 框架中 BeanFactory 接口的一个扩展。它提供了额外的功能
 * 允许你查询和操作在容器中定义的 bean 的列表。这个接口继承自 BeanFactory，
 * 并添加了一些新的方法，如 getBeanNamesForType(Class<?> type)
 * 和 getBeansOfType(Class<?> type)，这些方法允许你基于类型来获取 bean 的名称和实例。
 */
public interface ListableBeanFactory extends BeanFactory {

	boolean containsBeanDefinition(String beanName);

	int getBeanDefinitionCount();

	String[] getBeanDefinitionNames();

	String[] getBeanNamesForType(Class<?> type);

	<T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

}

