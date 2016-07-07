package com.android.test;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		String path ="d:\\DocCenter\\2016\\07\\01\\05\\38\\41\\DocID_4321\\022.jpg";
//		String path = "D://abcd";
		File dir = new File(path);
		if(!dir.exists()) dir.mkdirs();
		File file = new File(dir, "aaa.txt");
		System.out.println(file.getPath());
	}
}
