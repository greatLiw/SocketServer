package com.android.fileTranser;


import java.util.Properties; 
import java.io.InputStream; 
import java.io.IOException; 

/** 
* 读取Properties文件的例子 
* File: PropertiesUtil.java 
* Date: 2008-2-15 18:38:40 
*/ 
public final class PropertiesUtil { 
	
    public static String getProp(String path,String name) { 
    	String value="";
        try { 
        	InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream(path);
        	Properties p = new Properties();
        	p.load(in);
            value = p.getProperty(name).trim(); 
            value=new String(value.getBytes("ISO-8859-1"), "GBK");
        } catch (IOException e) { 
        	System.out.println(e.getMessage());
        	e.printStackTrace();
        }	
    	return value;
    } 
}