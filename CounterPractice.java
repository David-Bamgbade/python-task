import java.util.Scanner;

public class CounterPractice {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int failed = 0;
int pass = 0;

	for (int i = 0; i < 3; i++) {
		System.out.println("Enter number");
		int number = input.nextInt();

                if (number < 45){
		failed++;
		}
		
		else {
		pass++;
		}
}

System.out.println("Number of students that passed is " + pass);
System.out.println("Number of students that failed is " + failed);
		
		

}
} 