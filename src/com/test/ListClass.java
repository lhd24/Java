package com.test;

import java.util.*;

public class ListClass {

	private ArrayList ar = new ArrayList();
	
	public static void main(String[] args) {
		
		//�����ĸ�����List�ṹ��
		
		//�첽�ģ��̲߳���ȫ������Ϊ50%
		ArrayList al = new ArrayList();
		//ͬ���ģ��̰߳�ȫ������Ϊһ��
		Vector vc = new Vector<>();
		
		//��addFirst��addLast����������pop��push
		LinkedList ll = new LinkedList<>();
		//û��addFirst��addLast, ��pop��push
		Stack s = new Stack<>();
		
		
		//Map�ṹ���ֵ����ͣ�
		//ͬ���ģ��̰߳�ȫ�����ܷ���null
		Hashtable ht = new Hashtable<>();
		//�첽�ģ��̲߳���ȫ�����Է����ֵ��Ϊkey��value
		HashMap hs = new HashMap<>();
		
		
		
		System.out.println("��С" + al.size());
		
		String a = new String("abc");
		String b = "abc";
		System.out.println(a.equals(b));
		System.exit(0);
	}
}
