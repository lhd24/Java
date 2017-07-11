package com.test;

import java.util.*;

public class ListClass {

	private ArrayList ar = new ArrayList();
	
	public static void main(String[] args) {
		
		//以下四个都是List结构的
		
		//异步的，线程不安全；增量为50%
		ArrayList al = new ArrayList();
		//同步的，线程安全；增量为一倍
		Vector vc = new Vector<>();
		
		//有addFirst和addLast方法，可以pop和push
		LinkedList ll = new LinkedList<>();
		//没有addFirst和addLast, 有pop和push
		Stack s = new Stack<>();
		
		
		//Map结构（字典类型）
		//同步的，线程安全；不能放入null
		Hashtable ht = new Hashtable<>();
		//异步的，线程不安全；可以放入空值作为key或value
		HashMap hs = new HashMap<>();
		
		
		
		System.out.println("大小" + al.size());
		
		String a = new String("abc");
		String b = "abc";
		System.out.println(a.equals(b));
		System.exit(0);
	}
}
