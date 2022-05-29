package day0527;

public class PhoneMain {

	public static void main(String[] args) {
		Galaxy g1 = new Galaxy("갤럭시Z플립", "6.7인치 Dynamic Amoled", 1500000);

		Apple a1 = new Apple("iPhone 12 pro", "6.7인치 Super Letina", 1400000);
		
		g1.phoneInfo();
		a1.phoneInfo();
	}

}
