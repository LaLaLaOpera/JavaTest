package day0527;

class Point{
	int x = 10;
	int y = 20;
	
	Point(){
		
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point{
	int z = 30;
	
	Point3D(){
		this(1,2,33);
	}
	
	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
}


public class SuperCon {

	public static void main(String[] args) {
		Point3D p3 = new Point3D();
		
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);

	}

}
