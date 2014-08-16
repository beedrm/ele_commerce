package com.team.common.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ActualTypeUtils {
	/**
	 * sun
	 * 2014年8月15日上午10:13:09
	 * 注释：获得泛型的实体类型
	 */
	public static <T> Class getClassGenricType(final Class clazz) {
		Type genType=clazz.getGenericSuperclass();
		if (!(genType instanceof ParameterizedType)) {
			return Object.class;
		}else{
			Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
			return (Class) params[0];
		}
	}
}
