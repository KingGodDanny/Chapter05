package com.javaex.ex03;

public class Person {
	
	//필드
	private String name;
	private String hp;
	private String company;
	
	
	//생성자
	
	public Person() {
		super();
	}


	public Person(String name, String hp, String company) {
		super();
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	//메소드(게터세터)
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getHp() {
		return hp;
	}
	
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	
	public String getCompany() {
		return company;
	}
	
	
	public void setCompany(String company) {
		this.company = company;
	}

	
	//메소드(일반)
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	
	public void showInfo() {
		
		System.out.println("이름: " + name);
		System.out.println("핸드폰: " + hp);
		System.out.println("회사: " + company);
		System.out.println("");
		
	}
	public String save() {
		return name+","+hp+","+company;
				
	}
	
	
}
