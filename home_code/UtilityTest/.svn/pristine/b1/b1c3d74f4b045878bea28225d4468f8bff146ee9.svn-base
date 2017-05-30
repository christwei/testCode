package com.socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;



public class MultiTcpClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Socket soc = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedReader in= null;
        PrintWriter out = null;
        String str;
        
        soc = new Socket("localhost",8000);
        
        System.out.println("正连接服务器......");
        
        //in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        
        out = new PrintWriter(soc.getOutputStream(), true);
        
        //byte bmsg[]=new byte[20];
        
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        
        String msg;
        
        while ((msg = reader.readLine()) != null) {
			
			out.println(msg);
			System.out.println("当前client说：" +msg);
			//System.in.read(bmsg);
	        
	        //msg = new String(bmsg);
			
			if (msg.equals("quit")) {
				break;
			}
		}
        
        out.println(msg);
        
        scan();
	}
	
	public static void scan() {
	
	}

}
