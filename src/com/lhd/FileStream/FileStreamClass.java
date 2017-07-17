package com.lhd.FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamClass {

	public static void main(String[] args) {
		 //readFile();
		writeFile();
	}
	
	//FileInputStream
	public static void readFile(){
		
		//得到一个文件对象
		File f = new File("d:\\test.txt");
		FileInputStream fis = null;
		try {
			
			//因为File没有读写能力，所以需要一个InputStream
			fis = new FileInputStream(f);
			//定义一个字节数组，相当于缓存
			byte[] bytes = new byte[1024];
			//得到实际读取到的字节数
			int n = 0;
			
			while((n=fis.read(bytes)) != -1){
				String s = new String(bytes, 0 ,n);
				System.out.println(s);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			//关闭文件流
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	//FileOutputStream
	public static void writeFile(){
		
		File f = new File("d:\\ss.txt");
		//字节输出流
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			String s = "刘海栋 odk ok \r\n kasdasd";
			
			//定义一个字节数组，相当于缓存
//			byte[] bytes = new byte[1024];
			//把String 转成 byte数组
			
			fos.write(s.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
