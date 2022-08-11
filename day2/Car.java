package week1.day2;

public class Car {
	public void carBrand() {
		System.out.println("Toyota");
	}

	public String getCarColor() {
		return "Blue";
	}
	public int getCarEngineNumber() {
		return 55666566;
		}
	public void maths(int a, int b) {
		int c = a-b;
		int d = a*b;
		int e = a/b;
		System.out.println("Add" + "-" + c);
		System.out.println("multpl" +  "-" + d);
		System.out.println("divd" +  "-" + e);		
	}
	
	public static void main(String[] args) {
		Car implnt = new Car();
		implnt.carBrand();
		System.out.println(implnt.getCarColor());
		System.out.println(implnt.getCarEngineNumber());
		implnt.maths(10, 40);
	}
	}

