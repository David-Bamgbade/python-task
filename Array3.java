import java.util.Scanner;

public class Array3 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int counter = 0;
int count = 0;
int counts = 0; 
int total = 0;
int average = 0;
String student = null;
String StudentNames = "Student Names";
String Scores = "Scores";
int[] grades = new int[5];
String[] names = new String[5];
int grade = 0;

for(counter = 0; counter < 5; counter++) {
    System.out.println("Enter Student Name: ");
    input.nextLine();
    student = input.nextLine();
    names[counter] = student;

    System.out.println("Enter Student Grade: ");
    grade = input.nextInt(); 
    grades[counter] = grade;
     }

    System.out.printf("%s%8s%n", "StudentNames", "Scores");

    for(counts = 0; counts < 5; counts++) {
        System.out.printf("%s%n", student);
       }

    for(count = 0; count < 5; count++) {
        System.out.printf("%d%n", grade);
        }
        

     total = grade + total;
     average = total / 5;

     System.out.println("Total average Of Students: " + average + "\n"); 
     System.out.println("Total Score Of Students: " + total);
  

}
}



