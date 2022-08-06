package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 879456L;
	boolean isPunctured = true;
	String bikeName = "Activa";
	double runningKM = 123456789;

	public static void main(String[] args) {
		TwoWheeler r = new TwoWheeler();
		System.out.println(r.bikeName);
		System.out.println(r.chassisNumber);
		System.out.println(r.isPunctured);
		System.out.println(r.noOfWheels);
		System.out.println(r.runningKM);
		System.out.println(r.noOfMirrors);
	}
}
