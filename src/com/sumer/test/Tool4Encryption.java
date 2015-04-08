package com.sumer.test;

import com.sumer.util.ToolForEncryption;
import com.sumer.util.impl.ToolForEncryptionBeta;

public class Tool4Encryption {

	public static void main(String[] args) {
		ToolForEncryption tool4Encryption = new ToolForEncryptionBeta();
		System.out.println("result32: " + tool4Encryption.convertMD5("12345"));// 32位的加密
		System.out.println("result16: " +tool4Encryption.convertMD5("12345").substring(8, 24));// 16位的加密
	}

}
