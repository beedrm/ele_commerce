/*
 * Project: topdt-dev
 * Copyright 2011  Top Digital Technology  Co. Ltd.
 * All right reserved.
 */
package com.team.common.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 建立日期 : 2011-8-28下午05:33:33<br>
 * 作者 : 贾红磊<br>
 * 模块 : <br>
 * 描述 : <br>
 * 修改历史: 序号 日期 修改人 修改原因 <br>
 * 1 <br>
 * 2 <br>
 */
public class Page<T> {

	private String perPage=AppContext.getProperties("perPage");
	private String nextLabel=AppContext.getProperties("nextLabel");
	private String pageLinkShow=AppContext.getProperties("pageLinkShow");
	private String saePoint=AppContext.getProperties("saePoint");
	private String prevLabel=AppContext.getProperties("prevLabel");
	private Long count;
	private String curPage;

}
