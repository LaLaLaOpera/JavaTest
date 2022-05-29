package day0527;

public class Phone {
	String name;
	String spec;
	int cost;
	
	Phone(String name, String spec, int cost){
		this.name= name;
		this.spec = spec;
		this.cost = cost;
	}
	
	void phoneInfo() {
		System.out.printf("모델명 : %s\n", name);
		System.out.printf("스펙 : %s\n", spec);
		System.out.printf("가격 : %d\n", cost);
	}
}
