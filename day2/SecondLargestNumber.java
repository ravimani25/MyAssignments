package week1.day2;
import java.util.Arrays;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		int ars[] = {22,67,98,1,34,58,99};
		Arrays.sort(ars);
		System.out.println("second largest number:" + ars[ars.length - 2]);
	}
		
}
