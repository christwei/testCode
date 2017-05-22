package com.socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiTcpServer {
	
	ServerSocket svrSocket = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        
        
        
        //System.out.println("客户byebye了");
        
        
        
	}
	
	public void service() {
		try {
			svrSocket = new ServerSocket(8000);
			while (true) {
				Socket soc = null;
				soc = svrSocket.accept();
	            System.out.println("当前客户端口：" +soc.getPort());
	            Thread workThread = new Thread(new ThreadHandle(soc));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class ThreadHandle implements Runnable {
    private Socket socket;
    public static int count=0;
    
    public ThreadHandle(Socket socket) {
    	this.socket = socket;
    	count++;
    	System.out.println("当前计数：" +count);
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		BufferedReader in=null;
        byte bmsg[]=new byte[20];
        
        try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
