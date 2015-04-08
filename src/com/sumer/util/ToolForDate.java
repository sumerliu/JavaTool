package com.sumer.util;

public interface ToolForDate {
	
	public enum timeTemplate4Tool{
		
		DATEDETAIL("yyyyMMdd","������"),
		TIMEDETAIL("yyyyMMddhhmm","������ʱ��"),
		YEARMONTH("yyyyMM","����");
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
	 * @Description 用于根据日期模板获取当前标准时间
	 * @author liutj
	 * @param template
	 * @return 
	 * String
	 * 2015年4月8日
	 */
	String getCurrentTime(String template);

}
