package com.object;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class ObjectTest {
	public static void main(String[] args) {
		Person p = new Person("张三",30,1);
		p.eat();
		p.sleep();
		
		String a = new String("1");
		String b = new String("1");
		
		System.out.println(a==b);
		Vector vc = new Vector();

		
		Collection set = new HashSet();
		set.add("1");
		set.add("2");
		set.add("3");
		
		
		// 调用forEach()方法遍历集合
		for (Object obj : set) {
			System.out.println("遍历集合元素：" + obj);
		}
		
		// 创建集合、添加元素的代码与前一个程序相同
				Collection books = new HashSet();
				books.add("轻量级Java EE企业应用实战");
				books.add("疯狂Java讲义");
				books.add("疯狂Android讲义");
				// 获取books集合对应的迭代器
				Iterator it = books.iterator();
				
				while (it.hasNext()) {
					String book = (String)it.next();
					//it.remove();
					System.out.println("迭代集合元素：" + book);
				}
				
				Person per = new Worker();
	}
}

abstract class Plane { // 定义接口
	public abstract void fly(); // 定义方法
	public void repair() {
		System.out.println("飞机在修理");
	}
}

class Person {
	String name;
	int age;
	int sex;
	
	public Person() {
		System.out.println("Person");
	}
	
    public Person(String name, int age, int sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
    
    public void eat() {
    	System.out.printf("%s吃饭了",name);
    	//System.out.print("\r\n");
    }
    
    public void sleep() {
    	System.out.printf("%s睡觉了",name);
    	//System.out.print("\r\n");
    }
}

class Worker extends Person {
    public Worker() {
    	System.out.println("worker");
	}
    
    public Worker(String name, int age, int sex) {
		super(name,age,sex);
	}
}