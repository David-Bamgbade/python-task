import java.util.Scanner;

	public class AgeCollector {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
             
	int[] ages = new int[5];

       int counter = 0;
       int count = 0;

	for (counter = 0; counter < 5; counter++){
             System.out.println("Enter age: ");
              int age = scanner.nextInt();
              ages[counter] = age;
               }

            for(count = 0; count < 5; count++) {
            System.out.println(ages[count]);
            }


}
}