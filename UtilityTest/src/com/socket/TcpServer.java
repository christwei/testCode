package com.socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Socket soc = null;
        ServerSocket svrSocket = null;
        BufferedReader in=null;
        byte bmsg[]=new byte[20];
        
        svrSocket = new ServerSocket(8000);
        soc = svrSocket.accept();
        System.out.println("当前客户端口：" +soc.getPort());
        
        
        //InputStream is = null;
        in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        String tempString;
        //in.read(bmsg);
        //String str = new String(bmsg);
        
        while ((tempString=in.readLine())!=null ) {
        	System.out.println("当前客户说：" +tempString);
        	//=in.readLine();
        	//in.read(bmsg);
            //str = new String(bmsg);
        	if (tempString.equals("quit")) {
				break;
				
			}
        }
        
        
        System.out.println("客户byebye了");
        
        
        
	}

}
