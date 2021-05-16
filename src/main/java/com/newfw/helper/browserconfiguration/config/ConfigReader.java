package com.newfw.helper.browserconfiguration.config;

import com.newfw.helper.browserconfiguration.BrowserType;

/**
 * 
 * @author anirudha
 *
 */
public interface ConfigReader {
	
	public int getImpliciteWait();
	public int getExplicitWait();
	public int getPageLoadTime();
	public BrowserType getBrowserType();
	public String getUrl();
	public String getUserName();
	public String getPassword();

}
