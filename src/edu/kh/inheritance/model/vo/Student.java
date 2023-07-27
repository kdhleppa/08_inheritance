package edu.kh.inheritance.model.vo;

public class Student extends Person {
	// Student 클래스에 Person 클래스내용을 연장한다.

	
	
	
	// private String name;
	// private int age;
	// private String nationality;
	private int grade;
	private int classRoom;
	
	public Student() {
	
		// Student() 객체 생성 시
		// 내부에 상속받은 Person 객체를 생성하기위한
		// Person 생성자 호출 코드 필요하다!
	
		// super : 상위
		// super == Person
		// Person();
		super(); // super() 생성자
		// 부모의 생성자를 호출하는 코드
		// 반드시 자식생성자 최상단에 작성되어야 한다!
		// 부모의 생성자 실행(필드 초기화 +특정기능 수행)
		
		// * super() 생성자 때문에
		// 자식 객체 내부에 부모 객체가 생성된다!
		
		// *super() 생성자 미작성시
		// 컴파일러가 컴파일 단계에서 자동으로 추가해줌.
	}
	
	public Student(String name, int age, String nationality, int grade, int classRoom) {
//		this.name = name;
	//	this.age = age;
		//this.nationality = nationality;
		
		// this.name = name; 불가
		// 왜? 부모의 필드에 private 접근제한자가 있어서
		// 아무리 물려받은 자식이라도 다른 객체이기때문에 직접 접근 불가
		// -> 간접접근 방법 사용가능
		
		/*
		 * setName(name); setAge(age); 가능
		 */
		// 부모의 setter를 이용할 수 있지만 비효율적이다.
		
		
		super(name, age, nationality);
		this.grade = grade;
		this.classRoom = classRoom;
		
	}

	/* public String getName() {
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
*/
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	
	public String toString() {
		return super.toString()+" / " + grade +" / "+ classRoom;
	}

}
