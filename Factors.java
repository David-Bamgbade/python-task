import java.util.Scanner;

     public class Factors {
     public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter Factor To Be Found");
     int userInput = scanner.nextInt();

     int factor = 1;

     while (factor <= userInput) {
   
     if (userInput % factor == 0) {
         System.out.print("  " + factor);
         }
      factor++;
    } 
}
}

     
     