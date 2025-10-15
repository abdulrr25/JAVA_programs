package com.demo.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("text.txt");
			FileOutputStream fos = new FileOutputStream("txtcpy.txt");
			int i=fis.read();
			while(i!=-1) {
				fos.write(i);
				i=fis.read();
			}
			fis.close();
			fos.close();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
