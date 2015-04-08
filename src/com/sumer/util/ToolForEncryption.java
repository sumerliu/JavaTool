package com.sumer.util;

public interface ToolForEncryption {
	public enum EncryptionType{
		
		SHA1("SHA1"),
		MD5("MD5");
		private String encrytionType;
		private EncryptionType(String encrytionType) {
			this.encrytionType = encrytionType;
		}
		public String getEncrytionType() {
			return encrytionType;
		}
		public void setEncrytionType(String encrytionType) {
			this.encrytionType = encrytionType;
		}
		
	}

	/**
	 * @Description 将明文以MD5加密
	 * @author liutj
	 * @param encryptCode
	 * @return 
	 * String
	 * 2015年4月8日
	 */
	 String convertMD5(String encryptCode);
	 
	 /**
	  * @Description 将明文以SHA1加密
	  * @author liutj
	  * @param encryptCode
	  * @return 
	  * String
	  * 2015年4月8日
	  */
	 String convertSHA1(String encryptCode);
	 

}
