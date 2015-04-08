package com.sumer.test;

import com.sumer.util.ToolForNum;
import com.sumer.util.impl.ToolForNumBeta;

public class Tool4NumTest {
	
	public static void main(String[] args) {
		ToolForNum tool4Num = new ToolForNumBeta();
		int count = 100;
		while(count-->0){
			System.out.println(tool4Num.getRandomNum(2));
		}
	}
}
