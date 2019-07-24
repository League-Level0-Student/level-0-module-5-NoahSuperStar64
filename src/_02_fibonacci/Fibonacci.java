package _02_fibonacci;

public class Fibonacci {
public static void main(String[] args) {
	int Num1 = 0;
	int Num2 = 1;
	int temp = Num1;
	for (int i = 0; i < args.length; i++) {
		Num1 = Num2;
		Num2 = temp;
		temp = Num1;
	}
	
}
}
