package com.utility;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.ProgressMonitorInputStream;

public class UtiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple a = new Simple();
		Simple b = new Simple();
		System.out.println(a==b);
		
		System.out.println(factorial(5));
		
		try {
			// 创建FileOutputStream对象
			byte bb[] = new byte[2];
			try{
				FileInputStream fis = new FileInputStream("word.txt");
				ProgressMonitorInputStream in = 
					new ProgressMonitorInputStream(null,"读取文件",fis);
			   while(in.read(bb)!=-1){
				   String s = new String(bb);
				   System.out.print(s);
				   Thread.sleep(100);
			   }
			}catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace(); // 输出异常信息
		}
	}
	
	static int factorial(int n) {
		if (n==1) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}

}


class Simple {
	Simple(){
		
	}
}