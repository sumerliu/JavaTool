package com.sumer.util.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sumer.util.ToolForDate;

public class ToolForDateBeta implements ToolForDate {

	@Override
	public String getCurrentTime(String template) {
		Date uploadDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(template);
		String uploadDateStr = dateFormat.format(uploadDate);
		return uploadDateStr;
	}

}
