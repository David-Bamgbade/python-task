import java.util.Scanner;

public class TasK1 {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int score = 0;
int count = 0;
int[] array = new int[10];

for (int counter = 0; counter < 10; counter ++) {
     System.out.println("Enter Score");
     score = scanner.nextInt();      
     array[counter] = score;
     }
     
     for (count = 0; count < 10; count++) {
     System.out.println(array[count]);
     }


}
} 
