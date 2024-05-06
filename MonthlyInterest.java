import java.util.Scanner;

public class MonthlyInterest {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("enter balance");

double balance = scanner.nextDouble();

System.out.println("enter annualinterest");

double annualinterest = scanner.nextDouble();

double monthlyinterest = (balance * annualinterest / 1200);

System.out.printf("monthlyinterest is %f", monthlyinterest);
 
   }
} 






