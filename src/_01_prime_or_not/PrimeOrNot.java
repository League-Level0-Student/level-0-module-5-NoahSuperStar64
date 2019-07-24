package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	int i = 0;
String num = JOptionPane.showInputDialog("Pick a number, Any number.");	
int Num = Integer.parseInt(num);
for (i = 2; i < Num; i++) {
	if(Num%i==0) {
		JOptionPane.showMessageDialog(null, "FOOL, this is not a prime number!");
		break;
	}
}
if(i==Num){
	JOptionPane.showMessageDialog(null, "This is a prime number.");	
}
}
}
