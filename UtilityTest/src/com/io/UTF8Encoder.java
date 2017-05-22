package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *文件批量转换编码
 */
public class UTF8Encoder {

static List<File> fileList = new ArrayList<File>();

public static void main(String[] args) {
// TODO Auto-generated method stub
Encoder();
}

static void  Encoder() {
File folder = new File("E:\\办公\\It培训\\课件\\java疯狂讲义\\project_codes\\ball\\src\\org\\crazyit\\ball");

// 遍历文件夹
getFiles(folder);

for (File file : fileList) {
    //System.out.println(file.getParentFile().getAbsolutePath());
    
    String parentFolder = file.getParentFile().getAbsolutePath();
    String fileName = file.getName();
    if (!fileName.startsWith("UTF")) {
    
    
    writeUtf8File(parentFolder, fileName);
    
    }

}

}

static void getFiles(File fileOrFolder) {

    if (fileOrFolder.isDirectory() && !"gobang".equals(fileOrFolder.getName())) {
        for (File file : fileOrFolder.listFiles()) {
            getFiles(file);
        }
    } else if (fileOrFolder.isFile()) {
        if (fileOrFolder.getName().endsWith(".java") && 
        !fileOrFolder.getName().startsWith("UTF")) {
        fileList.add(fileOrFolder);
        }
    
    }

}

    static void writeUtf8File(String folder, String fileName) {
    try {
        
    File oldFile  = new File(folder+"\\"  + fileName);
    File newFile  = new File(folder+"\\" + "UTF8_" + fileName);
    
    
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(oldFile),"gbk"));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newFile),"utf-8"));
    int ch =  0;
    
    while((ch=br.read()) != -1){
    bw.write(ch);
    }
    
    bw.flush();
    br.close();
    bw.close();
    
    oldFile.delete();
    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    newFile.renameTo(oldFile);
    } catch (IOException e ) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    }
    
    
}

}
