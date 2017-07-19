package com.lhd.FileStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilecharClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void test1(){
		//文件去除字符流对象（输入流）
		FileReader fr = null;
		//写入到文件（输出流）
		FileWriter fw = null;
		
		try {
			
			//创建fr对象
			fr = new FileReader("D:\\test.txt");
			
			//创建输出对象
			fw = new FileWriter("D:\\vvv.txt");
			
			//记录实际读取到的字符数
			int n=0;
			
			//读入到内存
			char[] c = new char[1024];
			while((n=fr.read(c))!=-1){
				
				String s = new String(c,0,n);
				////直接打印的话，会有乱码，因为字符不足1024的话会自动补足
				//System.out.println(c);
				System.out.println(s);	
				
				//fw.write(c);		//会有乱码
				fw.write(c,0,n);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally{
			
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
