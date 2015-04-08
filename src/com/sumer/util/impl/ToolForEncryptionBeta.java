package com.sumer.util.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.sumer.util.ToolForEncryption;

public class ToolForEncryptionBeta implements ToolForEncryption {

	@Override
	public String convertMD5(String encryptCode) {
		 String result = "";
		try {
			byte[] md5ByteArray = getEncryptionByteArray(encryptCode,EncryptionType.MD5.getEncrytionType());
			result = encryptArrToCiphertext(md5ByteArray);
		} catch (NoSuchAlgorithmException e) {
		  e.printStackTrace();
		}
		return result;
	}
	
 
	@Override
	public String convertSHA1(String encryptCode) {
		String result = "";
		  try {
			  byte[] sha_1_ByteArray = getEncryptionByteArray(encryptCode,EncryptionType.SHA1.getEncrytionType());
			  result = encryptArrToCiphertext(sha_1_ByteArray);  
		  } catch (NoSuchAlgorithmException e) {
			  e.printStackTrace();
		  }
		  return result;
	}
	/**
	 * 
	 * @Description 用于根据加密类型获取加密byte数组
	 * @author liutj
	 * @param encryptCode
	 * @param encryptionType
	 * @return
	 * @throws NoSuchAlgorithmException 
	 * byte[]
	 * 2015年4月8日
	 */
	byte[] getEncryptionByteArray(String encryptCode,String encryptionType) throws NoSuchAlgorithmException{
		MessageDigest md = MessageDigest.getInstance(encryptionType);
		md.update(encryptCode.getBytes());
		byte md5ByteArray[] = md.digest();
		return md5ByteArray;
	}
	/**
	 * @Description 用于将加密数组转化为暗文
	 * @author liutj
	 * @param encryptByteArray
	 * @return 
	 * String
	 * 2015年4月8日
	 */
	String encryptArrToCiphertext(byte[] encryptByteArray){
		int byteFromEncryptArr;
		String result = "";
		StringBuffer buf = new StringBuffer("");
		for (int offset = 0; offset < encryptByteArray.length; offset++) {
			byteFromEncryptArr = encryptByteArray[offset];
			if (byteFromEncryptArr < 0){
				byteFromEncryptArr += 256;
			}
			if (byteFromEncryptArr < 16){
				buf.append("0");
			}
			buf.append(Integer.toHexString(byteFromEncryptArr));
		}
		result = buf.toString();
		return result;
	}
	
	
	private String AttackMD5(String hashString)
    {
        for (int i = 0; i <= 999999; i++)
        { 
            String testString = String.valueOf(i);
            while (testString.length() < 6)
                testString = "0" + testString;
            if (convertMD5(testString).equals(hashString))
                return testString;
        }

        return null;
    }

}
