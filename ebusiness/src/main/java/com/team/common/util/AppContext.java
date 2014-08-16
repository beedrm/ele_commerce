package com.team.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AppContext {
	public static void main(String[] args) {
		System.out.println(AppContext.getProperties("hrefCountOfPage"));
	}
	private static Log log = LogFactory.getLog(AppContext.class);
	private static String CONFIG_PROPERTIES_FILE = "app-config.properties";// 加载的配置文件名称
	private static Properties CONFIG = null;// 配置文件对象
	
	/**
	 * sun 2014年8月15日上午11:10:48 注释：加载工程的配置文件
	 */
	private synchronized static void load() {
		if (CONFIG == null) {
			URL prop_url = ClassLoader.getSystemResource(CONFIG_PROPERTIES_FILE);
			InputStream prop_in = null;
			try {
				CONFIG = new Properties();
				if (prop_url != null) {
					prop_in = prop_url.openStream();
					CONFIG.load(prop_in);
				}
			} catch (IOException e) {
				log.error("加载配置文件【" + CONFIG_PROPERTIES_FILE + "】异常！", e);
			} finally {
				try {
					if (prop_in != null)
						prop_in.close();
				} catch (IOException e) {
				}
			}
		}
	}

	/**
	 * sun 2014年8月15日上午11:11:22 注释：获得配置文件的某个属性
	 */
	public static String getProperties(String key) {
		if (CONFIG == null)
			load();
		return CONFIG.getProperty(key);
	}
}
