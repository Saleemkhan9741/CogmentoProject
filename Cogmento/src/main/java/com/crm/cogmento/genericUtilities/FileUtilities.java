package com.crm.cogmento.genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtilities {
	public String getKey(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./config.properties");
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
}
