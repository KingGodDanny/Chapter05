package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException { //오류를 그냥 던진다.
		
		InputStream in = new FileInputStream("C:\\Javastudy\\file\\img.jpg");
		
		OutputStream out = new FileOutputStream("C:\\Javastudy\\file\\byteImg.jpg");  //파일명을 다르게해야한다. 
		
		int data;
		
		System.out.println("복사시작==============");
		while(true) {
			data = in.read();							//.read는 섞어쓰기 되서 InputStream의 메소드를 쓰는것이다.
			if(data == -1) {    
				
				System.out.println("복사끝: " + data);
				break;
			}
			
			out.write(data);   //위에 data에 -1이 되면 break에 걸리고 이곳에 와서 뱉어버린다. 
							   //그리고 .write는 OutputStream의 메소드를 사용한것.!!!
			
		}
		
		
		
		out.close();
		in.close();
		
	}

}
