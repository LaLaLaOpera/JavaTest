package package2;

import package1.A;

public class D {

	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.pub);
		//System.out.println(a.pro); //에러. 같은 패키지. 다른 패키지의 자손클래스
		//System.out.println(a.def);
		//System.out.println(a.pri);

	}

}