package com.lhd.FileStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedClass {

	public static void main(String[] args) {

	}

	public void test1(){
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			
			FileReader fr = new FileReader("D:\\test.txt");
			br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("D:\\vvv.txt");
			bw = new BufferedWriter(fw);
			
			//循环读取文件
			String s = "";
			while((s=br.readLine())!=null){
				//它会连续读，不带换行符
				System.out.println(s);
				
				bw.write(s + "\r\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
