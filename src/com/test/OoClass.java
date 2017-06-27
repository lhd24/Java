package com.test;

public class OoClass {

	public void a(){
		
	}
}

class SubTest extends OoClass {

	@Override
	public void a() {
		
	}
	
	public String aa()
	{
		return null;
	}

}
//相当于
interface IUsb{
	int a = 1;		//相当于 finial static
	String aa = "";
 	void c();
	public void aac();
}

class SubInterface implements IUsb {

	@Override
	public void c() {
		int ab = IUsb.a;
		System.out.println(ab);
	}

	@Override
	public void aac() {
		// TODO Auto-generated method stub
		
	}
	
}