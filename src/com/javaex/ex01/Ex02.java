package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\Javastudy\\file\\img.jpg");
		
		OutputStream out = new FileOutputStream("C:\\Javastudy\\file\\byteBufferImg.jpg");
		
		int data;
		
		byte[] buff = new byte[1024];    //4바이트로 된 애를 1024만큼 모아서 간다.    -->>쟁반개념임 buff에 담는것
		
		System.out.println("복사시작");
		while(true) {
			data = in.read(buff);      //data = in.read();은 엄연히 다른 개념! 첫번째껀 buff에 담는것!
			if(data == -1) {
				System.out.println("복사끝: " + data);
				break;
			}
			out.write(buff);
		}
		
		
		
		
		out.close();
		in.close();
		
		
	}

}
