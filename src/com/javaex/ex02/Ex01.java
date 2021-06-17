package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("C:\\Javastudy\\file\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("학교종이 링롱랭롱");  //속도개선도 장점이지만 줄바꿈도 편하게 할수있다.
		bw.newLine(); 			   //줄바꿈기능
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다.");
		
		
		bw.close();
		
		
		
//		속도의 단점예시 >> 위의 보조스트림을 통한 속도개선 문법
//		Writer fw = new FileWriter("C:\\Javastudy\\file\\song.txt");
//
//		String str01 = "학교종이 땡떙떙 어서 모이자 선생님이 우리를 기다리신다.";
//		
//		
//		fw.write(str01);
//		
//		
//		
//		
//		fw.close();
	}

}
