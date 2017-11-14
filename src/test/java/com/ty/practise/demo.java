package com.ty.practise;


class demo1
{
	
//	static
//	{
//		System.out.println("i m static block of super class");
//	}
	demo1()
	{
		System.out.println("i m super class constructor");
	}
	int a;
	{
		a=10;
		System.out.println("i m nonstatic block of super class");
	}
}
class demo extends demo2
{
//	static
//	{
//		System.out.println("i m static block of child class");
//	}
	
	demo()
	{
		System.out.println("i m child class constructor");
	}
	int a;
	{
		a=20;
		System.out.println("i m nonstatic block of child");
	}
	public static void main(String[] args) 
	{
		System.out.println("main start");
		demo d=new demo();
		System.out.println("main end");
	}
}


                                                                                                                                