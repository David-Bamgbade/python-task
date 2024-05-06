import java.util. Scanner;
    
       public class Binary {
       public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
  
       int counter = 0;     

       System.out.println("Welcome TO Binary hub how many times would you like to play? ");
       int playTime = scanner.nextInt();

        while (counter < playTime) { 

       System.out.println("Enter Number");
       int userInput = scanner.nextInt();
        
       if (userInput == 1) {
        System.out.println("0");}

       if (userInput == 0) {
        System.out.println("1");}

       counter = counter + 1;
}
}
}

      

     