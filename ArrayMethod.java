import java.util.Arrays;

import java.util.Scanner;

public class ArrayMethod {
public static void main(String[] args) {	

Scanner scanner = new Scanner(System.in);

	int[] array = {1,8,13,7,12};
	int[] evenNumber = new int[array.length];

	int sum = 0;
	int i = 0;
	int count = 0;

	for (i = 0; i < array.length; i++) {
	
	if (array[i] % 2 == 0){
	evenNumber[count] = array[i];
	count++;
	
        }
    }
	
	for (int num : evenNumber) {
	System.out.print(num);
	}

}
}
