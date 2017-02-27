package md5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class md5Check {
	public static String MD5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		MessageDigest md5=MessageDigest.getInstance("MD5");
		BASE64Encoder base = new BASE64Encoder();
		String newstrs = base.encode(md5.digest(str.getBytes("utf-8")));
		return newstrs;
	}
	
	public static boolean tsMD5(String newstrs,String paws) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		if(MD5(paws).equals(newstrs))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) throws Exception{
		String str = MD5("123123");
		System.out.println(str);
		System.out.println("9bsMjeFGxntEurv05lhMwA==----");
		System.out.println(tsMD5(str,"123123"));
	}
}
