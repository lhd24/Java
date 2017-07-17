/**
 * 功能: File类的基本用法
 */

package com.lhd.FileStream;

import java.io.File;
import java.io.IOException;

public class FileClass  {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
	}

	public void test1(){
		//创建一个文件对象
		File f = new File("d:\\lhd.txt");
		
		//得到文件的路径
		System.out.println("文件路径:" + f.getAbsolutePath());
		//得到文件的大小，字节数
		System.out.println("文件大小:" + f.length());
		System.out.println("可读" + f.canRead());
	}
	
	public void test2() throws IOException {
		//创建文件和创建文件夹
		File f = new File("d:\\lhd.txt");
		if (!f.exists()) {
			//可以创建
			f.createNewFile();
		}
		else{
			System.out.println("有文件，不能创建");
		}
	}
	
	public void test3(){
		File f = new File("d:\\ff");
		if (f.isDirectory()) {
			System.out.println("文件夹已经存在");
		}
		else{
			//创建
			f.mkdir();
		}
	}
	
	//列出一个文件夹下面的所有文件
	public void test4(){
		File f = new File("d:\\ff");
		if (f.isDirectory()) {
			File lists[] = f.listFiles();
			for (int i = 0; i < lists.length; i++) {
				System.out.println("文件名:" + lists[i].getName());
			}
		}
	}
}
