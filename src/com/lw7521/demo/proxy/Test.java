package com.lw7521.demo.proxy;

public class Test implements TestInterface1,TestInterface2{

	@Override
	public String Print2() {
		System.out.print("This is Test2!"+this.getClass().getInterfaces().getClass().getName()+" \n");
		return this.toString();
	}

	@Override
	public String Print1() {
		//System.out.print("This is Test1!" +this.getClass().getInterfaces().getClass().getName()+" \n");
		return this.toString();
	}

}
