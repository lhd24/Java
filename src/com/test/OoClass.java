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
//�൱��
interface IUsb{
	int a = 1;		//�൱�� finial static
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