import java.util.Scanner;

       public class Comparator {
       public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter number 1:");
       int number1 = scanner.nextInt();

       System.out.println("Enter number 2:");
       int number2 = scanner.nextInt();

       if (number1 == number2) {
       System.out.println("number is 0");
       }

       if (number1 > number2) {
       System.out.println("number is 1");
       }

       if (number2 > number1) {
       System.out.println("number is -1");
       }
     
       }
   }