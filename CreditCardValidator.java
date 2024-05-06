import java.util.Scanner;
import java.util.Arrays;

public class CreditCardValidator {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int sumss = 0;

	int sum = 0;

	int summing = 0;

	int i = 0;

	int sums = 0;

	int[] cardNumber = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};

	for (i = 0; i < cardNumber.length; i++) {
	sum = cardNumber[i] + cardNumber[i];
	if (sum > 9) {
	System.out.println(sum);			
	
	if (sum > 9) {
	sums = sum % 10;
	sumss = sum / 10;
	summing = sum + sumss;
	System.out.println(summing);
	}
	}
	}
	




	}
	}

 


