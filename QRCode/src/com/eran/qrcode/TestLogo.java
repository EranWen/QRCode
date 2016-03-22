package com.eran.qrcode;

public class TestLogo {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String text = "http://www.baidu.com";
			QRCodeUtil.encode(text, "c:/обть/timg.jpg", "D:/Java/Projects/image/", true);
		} catch (Exception e) {
			e.printStackTrace();
		
}
}
}