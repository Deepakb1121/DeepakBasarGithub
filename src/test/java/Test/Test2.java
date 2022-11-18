package Test;

import org.testng.annotations.Test;

import Utility.BaseClass1;

public class Test2 extends BaseClass1 {

	@Test(groups="Sanity")
	public void A1()
	{
		System.out.println("sanity test A1");
	}
	@Test(groups="Regression")
	public void A2()
	{
		System.out.println("regression test A2");
	}
	@Test(groups="Sanity")
	public void A3()
	{
		System.out.println("sanity test A3");
	}
	@Test(groups="Regression")
	public void A4()
	{
		System.out.println("regression test A4");
	}

}
