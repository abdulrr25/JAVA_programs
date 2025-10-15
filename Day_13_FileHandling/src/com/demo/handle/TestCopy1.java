package com.demo.handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("text.txt");
		FileOutputStream fos = null;
		try {
			if(f.exists()) {
				fos = new FileOutputStream("txtcpy.txt",true);
			}
			else {
				fos = new FileOutputStream("txtcpy.txt");
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try (FileInputStream fis=new FileInputStream("text.txt");
				FileOutputStream fos1=fos;
			){
			int i=fis.read();
			while(i!=-1) {
				fos1.write(i);
				i=fis.read();
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
