package day0527;

class Animal{
	String name;
	String color;
	int age;
	static int count;
	Animal(String name, String color, int age){
		count ++;
		this.name = name;
		this.color= color;
		this.age = age;
		System.out.printf("접수된 동물의 이름은 '%s'이며 색은 %s 나이는 %d살 입니다.\n", name, color, age);
		System.out.printf("지금까지 접수된 반려동물 수 : %d\n", count);
	}
}

public class AnimalMain {

	public static void main(String[] args) {
		//동물이름, 색깔, 나이 입력
		Animal a1 = new Animal("자기야","흰색", 14);
		Animal a2 = new Animal("다람이", "갈색", 5);


	}

}
