package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,7,6,8};
		Arrays.sort(a);
		for (int i=0; i<a.length; i++)
		{
			int num = i+1;
			if (num!=a[i])
			{
				System.out.println(num);
				break;
			}
		}
	}

}
