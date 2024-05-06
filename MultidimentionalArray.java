import java.util.Scanner;
import java.util.Arrays;


public class MultidimentionalArray {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int i = 1;
	int students = 0;
	int subjects = 0;
	int j = 0;
	int total = 0;

	System.out.println("How many students do you have");
	students = scanner.nextInt();

	System.out.println("How many subject do they offer");
	subjects = scanner.nextInt();

	System.out.println();

	for (i = 1; i <= students; i++) {
	for (j = 1; j <= subjects; j++) {
		System.out.printf("Entering Score for student %d%n", i);
		System.out.printf("Enter Score for subject %d%n", j);
		int subject = scanner.nextInt();

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved Succesfully");

	System.out.println();
	
	total = total + subjects;
	int average = total / subjects;

	

   }
}

	int[][] collection = {{students}, {subjects}};	

	for(int counter = 0; counter <= collection.length; counter++) {
	for(int count = 0; count <= collection.length; count++) {
	System.out.println(collection[counter]);
	











}
}
		 		

	System.out.println("======================================================================================================");
	System.out.println("STUDENT" + "\t" + "SUB1" + "\t" + "SUB2" + "\t" + "SUB3" + "\t" + "TOT" + "\t" + "AVE" + "\t" + "POS");
	System.out.println("====================================================================================================");








}
}