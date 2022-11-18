package Test;

import org.testng.annotations.Test;

import Utility.BaseClass1;

public class Test1 extends BaseClass1 {

	@Test(groups="Sanity")
	public void M1()
	{
		System.out.println("sanity test m1");
	}
	@Test(groups="Regression")
	public void M2()
	{
		System.out.println("regression test m2");
	}
	@Test(groups="Sanity")
	public void M3()
	{
		System.out.println("sanity test m3");
	}
	@Test(groups="Regression")
	public void M4()
	{
		System.out.println("regression test m4");
	}
	
	
	
	
	
	
}
