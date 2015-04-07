package com.sumer.util;

public interface ToolForDate {
	
	public enum timeTemplate4Tool{
		
		DATEDETAIL("yyyyMMdd","年月日"),
		TIMEDETAIL("yyyyMMddhhmm","年月日时分"),
		YEARMONTH("yyyyMM","年月");
		private String timeTemplate;
		private String alias;
		private timeTemplate4Tool(String timeTemplate, String alias) {
			this.timeTemplate = timeTemplate;
			this.alias = alias;
		}
		public String getTimeTemplate() {
			return timeTemplate;
		}
		public String getAlias() {
			return alias;
		}
	}
	
	/**
	 * 
	 * @Description 根据传入时间的模板，获取当前时间点的字符串。
	 * @author liutj
	 * @param template
	 * @return 
	 * String
	 * 2015年4月7日
	 */
	String getCurrentTime(String template);

}
