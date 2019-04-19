package com.example.demo.util;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.tomcat.util.codec.binary.Base64;

public class Security {
	
	final static String ALGO = "AES";
	final static byte[] KEY = "Th!sIsV3rySecure".getBytes();

	public static String encrypt(String str) throws Exception {
		Key key = new SecretKeySpec(KEY, "AES");
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.ENCRYPT_MODE, key);
		byte[] encVal = c.doFinal(str.getBytes());
		return Base64.encodeBase64String(encVal);
	}

	public static String decrypt(String str) throws Exception {
		byte[] encrypted = Base64.decodeBase64(str);
		Key key = new SecretKeySpec(KEY, "AES");
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.DECRYPT_MODE, key);
		byte[] decValue = c.doFinal(encrypted);
		return new String(decValue);
	}
}

