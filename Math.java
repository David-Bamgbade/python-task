import java.util.Scanner;
    
       public class Math {
       public static void main(String [] args) {
  
       Scanner scanner = new Scanner(System.in);
      
       System.out.println("Enter a number");
       int number1 = scanner.nextInt();

       System.out.println("Enter a number");
       int number2 = scanner.nextInt();

       int sum = number1 + number2;
       System.out.printf("The sum of %s and %s is %d%n ", number1, number2, sum); 

       int average = number1 + number2 / 2;
       System.out.printf("The average of %s and %s is %d%n ", number1, number2, average);
 
       int product = number1 * number2;
       System.out.printf("The product of %s and %s is %d%n ", number1, number2, product);

       
       
       
}
}