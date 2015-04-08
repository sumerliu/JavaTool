package com.sumer.test;

import com.sumer.util.ToolForDate;
import com.sumer.util.ToolForDate.timeTemplate4Tool;
import com.sumer.util.impl.ToolForDateBeta;

public class Tool4DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToolForDate tool4Date = new ToolForDateBeta();
		System.out.println(tool4Date.getCurrentTime(timeTemplate4Tool.DATEDETAIL.getTimeTemplate()));
	}

}
