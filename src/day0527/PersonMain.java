package day0527;

class Person{
	//주민번호, 국적, 이름
	final String SSN;
	final String nation = "kor";
	String name;
	
	Person(String SSN, String name){
		this.SSN = SSN;
		this.name = name;
	}
}

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("2323", "박코딩");
		
		System.out.println(p1.name+ p1.nation+ p1.SSN);
		
	}

}
