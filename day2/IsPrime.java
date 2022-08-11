package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		int n = 47, count = 0;
		for(int i=2; i<n-1; i++)
		{
			if(n%i==0)
			{
				System.out.println("The number is non - prime");
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("The number is prime");
		}
	}

}
