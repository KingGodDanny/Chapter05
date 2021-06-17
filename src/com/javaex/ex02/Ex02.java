package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		//Reader fr = new FileReader("C:\\Javastudy\\file\\MS949.txt");
		Reader fr = new FileReader("C:\\Javastudy\\file\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		String str = "";
		while(true) {
			str = br.readLine();   //한줄씩 읽어온다. 줄바꿈기호는 제외해서 읽어온다.
			if(str == null) { //텍스트 스트링이기때문에 숫자처럼 0이아니고 null이다.
				break;
			}
			
			System.out.println(str);
			
		}
			
		
		br.close();
		
	}

}
