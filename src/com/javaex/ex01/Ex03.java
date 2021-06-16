package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\Javastudy\\file\\img.jpg");     //FileInputStream이 주스트림. 권총으로 치면 권총을 의미함!
		BufferedInputStream bin = new BufferedInputStream(in);                    //보조스트림이고 권총으로치면 소음기를 나타냄. 소음기혼자서는 아무 쓸모없고
																				  // 주스트림에 보조스트림을 낀다고 생각하고 주스트림인 in이 보조스트림에 장착됌.
		
		OutputStream out = new FileOutputStream("C:\\Javastudy\\file\\buffImg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
	
		int data;
		
		System.out.println("복사시작");
		while(true) {
			data = bin.read();
			if(data == -1) {
				System.out.println("복사끝: " + data);
				break;
			}
			
			
			bout.write(data);
			
		}
		
		
		
		bout.close(); //바로 위에꺼가 내려와서 먼저끝나고 
		bin.close();  //그다음 bin 임포트가 끝난다.
		
		
		
	}

}
