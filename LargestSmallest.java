import java.util.Scanner;

       public class LargestSmallest {
       public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

      int largestNumber = 0;
      int smallestNumber = 0;
      char choice;
 

      do {
        System.out.println("Enter a number");
       int number = scanner.nextInt();

       if (number > 1) {
       number++;
       }

       else if (number < 1) {
       number++;
       }
 
        System.out.print("Do you want to continue y/n ");
         choice = scanner.next().charAt(0);

          } while(choice == 'y' || choice == 'Y');       

       System.out.println("The largestNumber is " + largestNumber);
       System.out.println("The smallestNumber is " + smallestNumber);


}

}
       

       

