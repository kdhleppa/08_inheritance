package edu.kh.inheritance.model.vo;

public class Person {
	// class명에 object에 대한 상속구문이 없다면
	// 컴파일러가 자동으로 extends Obect 구문을 추가
	
	
	// 필드
	
	private String name;
	private int age;
	private String nationality; 
	
	// 생성자
	// 기본생성자;
	public Person() {}
	
	// 매개변수 생성자
	



	
	public Person(String name, int age, String nationality) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	// 메서드
	// getter/setter
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	public void breath() {
		System.out.println("사람은 코나 입으로 숨을 쉰다");
		
	}
	
	public void move() {
		System.out.println("사람은 움직일 수 있다.");
		
	}

	@Override
	public String toString() {
		return name + " / " + age + " / " + nationality;
	
	
	}

}
