package package1;

public class A {

	public int pub; //제한 없음
	protected int pro; //같은 패키지+다른패키지 자손
	int def; //같은 패키지 내에서만
	private int pri; //같은 클래스에서만 접근가능
	
	public void printMembers() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(pri);
	}
}
