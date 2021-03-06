package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) throws IOException {

		// 파일읽는다. -->한줄씩읽는다 -->출력
		Reader fr = new FileReader("C:\\JavaStudy\\file\\PhoneDB.txt");
		BufferedReader bfr = new BufferedReader(fr);

		List<Person> pList = new ArrayList<Person>();
		// name hp company를 저장할 도장을 찍을 클래스를 만든다
		// Person을 메모리에 올려서 관리할것이다.

		Person d = new Person("대니", "010-6284-3410", "백수다"); // 생성자사용

		String line = "";
		while (true) {
			line = bfr.readLine();
			if (line == null) { // 문자는 null , 숫자는 -1로 끊는다.
				break;
			}

			// 짜르는 코드
			String[] pInfo = line.split(","); // new String[3]
			// pInfo는 주소고 따라가보면 String[]이 있다!!!!

			String name = pInfo[0];
			String hp = pInfo[1];
			String company = pInfo[2];

			Person person = new Person(name, hp, company);

			pList.add(person);

		}

		pList.add(3, d);

		Writer fw = new FileWriter("C:\\Javastudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i = 0; i < pList.size(); i++) {
			bw.write(pList.get(i).save()); // 받은 정보들을 메모장의 형식으로 리턴해야하니깐 .save
			bw.newLine();
		}

		for (int i = 0; i < pList.size(); i++) {
			System.out.println("이름: " + pList.get(i).getName());
			System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
			System.out.println("");
		}

		
		
		bw.close();
		bfr.close();
	}

}
