import java.util. Scanner;
    
       public class LuckyNumber {
       public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       int luckyNumber = 20;
  
       System.out.println("Enter Number");
       int number = scanner.nextInt();

       if (number < luckyNumber) {
       System.out.println("Too low"); }

       else if (number > luckyNumber) {
       System.out.println("Too high");}

       if (number == luckyNumber) { 
       System.out.println("Correct");}

}
}
   
       