import java.util. Scanner;
    
       public class NumberOfGames {
       public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter name");
       String name = scanner.nextLine();
       System.out.println("Welcome TO Guess Game " + name);

       int numberOfPlays = 0;

       System.out.println("Enter how many times you want to play");
       int playTime = scanner.nextInt();
      
       int counter = 0;

       while (counter < playTime) {
      
       int luckyNumber = 20;
       
       System.out.println("Enter Number");
       int number = scanner.nextInt(); 
       
       if (number < luckyNumber) {
       System.out.println("Too low"); }

       else if (number > luckyNumber) {
       System.out.println("Too high");}

       if (number == luckyNumber) { 
       System.out.println("Correct");}

       counter = counter + 1;
}
       
      

     
    
   




}
}   