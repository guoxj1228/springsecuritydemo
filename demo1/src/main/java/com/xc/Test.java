package com.xc;

public class Test {

	public static void main(String[] args) {
		String str = "2019-02-13 15:57:16.0";
		int indexOf = str.indexOf(".");
		String substring = str.substring(0,indexOf);
		System.out.println(indexOf);
		System.err.println(substring);
	}
}
