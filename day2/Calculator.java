package week1.day2;

public class Calculator {
	int num1 = 2; int num2 = 8; int num3 = 9;
	
public void Addition (int num1, int num2, int num3) {
	int add = num1+num2+num3;
	System.out.println(add);
}

public void Subtract (int num1, int num2) {
	int sub = num1-num2;
	System.out.println(sub);
}
public void Multipl (double num1, double num2) {
	double mult = num1*num2;
	System.out.println(mult);
}
public void Divide (float num1, float num2) {
	float divd = num1/num2;
	System.out.println(divd);
}
}
