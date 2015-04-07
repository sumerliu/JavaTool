package com.sumer.util.impl;

import com.sumer.util.ToolForNum;

public class ToolForNumBeta implements ToolForNum{

	@Override
	public String getRandom4Num(int digit) {
		String strForNum = "";
		int basic = (int)Math.pow(10, digit);
		Integer random = new Integer((int)(Math.random()*basic));
		String tail = random.toString();
		int loopCount4ZeroPlus = digit-tail.length();
		while(loopCount4ZeroPlus-->0){
			strForNum +="0"; 
		}
		strForNum += tail;
		return strForNum;
	}

}
