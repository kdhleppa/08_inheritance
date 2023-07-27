package edu.kh.inheritance.model.service;

import java.util.Scanner;

import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InheritanceService {
	
	// 상속 황인 예제
	public void ex1() {
		
		Person p = new Person();
		
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println("=================================");
		
		
		// Student 객체 생성
		
		Student st = new Student();
		
		// Student만의 고유한 필드
		st.setGrade(3);
		st.setClassRoom(5);
		// Person 클래스로 부터 상속받은 필드, 메서드
		st.setName("고길동");
		st.setAge(19);
		st.setNationality("대한민국");
		
		
		System.out.println(st.getGrade());
		System.out.println(st.getClassRoom());
		System.out.println(st.getName());
		System.out.println(st.getAge());
		System.out.println(st.getNationality());
		
		
		Employee emp = new Employee();
		emp.setCompany("집");
		emp.setName("kim");
		emp.setAge(20);
		emp.setNationality("korea");
		
		System.out.println(emp.getCompany());
		System.out.println(emp.getName());
		
		// 추가된 breath() 메서드 상속 확인하기
		p.breath();
		st.breath();
		emp.breath();
		// 상속의 특징 : 코드 추가 및 수정에 용이함
		// -> 부모에게 정의하면 상속받은 자식들은 모두 부모의 것을 그대로
		// 받아서 슬 수 있음!
		
		
		
		
	}
	// super() 생성자 사용방법
	public void ex2() {
		
		// Student 매개변수 5개짜리 생성자
		Student std = new Student("김철수", 17, "한국", 1, 3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
	}
	
	public void ex3() {
		Student std = new Student();
		
		Employee emp = new Employee();
		
		std.move(); // 오버라이딩 X -> Person의 메소드 수행
		emp.move(); // 오버라이딩 O -> Employee의 메소드 수행
	}
	
	public void ex4() {
		// 모든 클래스는 Object 클래스의 후손
		// == 모든 클래스의 최상위 부모는 Object
		
		
		Person p = new Person();
		// Object를 상속받은 Person객체 생성
		
		Student std = new Student();
		// Person을 상속받은 Student객체 생성
		
		// Object - Person - Student
		
		System.out.println(p.hashCode());
		System.out.println(std.hashCode());
		// Person이 Object에서 물려받은 HashCode()를
		// Student가 또 물려받아 사용
		
		String str = "abc";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(str.hashCode());
		// String - Object
		System.out.println(sc.hashCode());
		// Scanner - Object
		
	}
	
	public void ex5() {
		
		Person p = new Person("김철수", 17, "한국");
		
		System.out.println(p.toString());
		
		System.out.println(p);
		// print 구문 수행 시 참조 변수명을 작성하면
		// 자동으로 toString() 메소드를 호출해서 출력한다.
		
		Student std = new Student("kim", 29, "korea", 1, 1);
		
		System.out.println(std.toString());
	}

}
