package com.generic;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
class Apple<T extends Number>
{
	T size;
	public Apple()
	{
	}
	public Apple(T size)
	{
		this.size = size;
	}
	public void setSize(T size)
	{
		this.size = size;
	}
	public T getSize()
	{
		return this.size;
	}
}

/*class Orange<T implements Comparable<Integer>>
{
	
}*/

public class A3_ErasureTest
{
	public static void main(String[] args)         
	{
		Apple<?> a = new Apple<>(6);    // ①
		System.out.println(a.getSize());
		//Apple<String> b = new Apple<>("cc");    //

	}
}
