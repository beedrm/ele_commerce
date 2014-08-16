package com.team.common.controller;

import org.apache.log4j.Logger;

import com.team.common.util.ActualTypeUtils;
import com.team.common.util.Page;



public class CommonController<T>{
	
	Logger logger=Logger.getLogger(getClass()); //日志
	private Class<T> entityClass; // T的反射类型
	protected T entity; // T类型对象
	protected Page<T> page;//翻页情况
	
	public CommonController() {
		super();
		this.entityClass=ActualTypeUtils.getClassGenricType(getClass());
		initEntity();
	}
	/**
	 * sun
	 * 2014年8月15日上午10:25:57
	 * 注释：实例化entity
	 */
	public T initEntity() {
		if (entity == null)
			try {
				entity = entityClass.newInstance();
			} catch (InstantiationException e) {
				logger.error("泛型实例化异常，class=" + entityClass.getName(), e);
			} catch (IllegalAccessException e) {
				logger.error("泛型实例化异常，class=" + entityClass.getName(), e);
			}
		return entity;
	}
	
	public T getEntity() {
		return entity;
	}
	public void setEntity(T entity) {
		this.entity = entity;
	}
	public Page<T> getPage() {
		return page;
	}
	public void setPage(Page<T> page) {
		this.page = page;
	}
	
}