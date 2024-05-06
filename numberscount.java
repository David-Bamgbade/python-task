import java.util.Scanner;
 
     public class NumbersCount {
     public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     int positive = 0;

     int negative = 0;

     int zero = 0;

     char choice;

     do
        {
         
         System.out.println("enter a number");
         int number = scanner.nextInt();

          if (number > 0) {
          positive++;
          }

          else if (number < 0) {
          negative++;
          }
   
          else if ( number == 0) {
          zero++;
         }
        
         System.out.print("Do you want to continue y/n ");
         choice = scanner.next().charAt(0);

          } while(choice == 'y' || choice == 'Y');

         System.out.println("positive numbers:" + positive);
         System.out.println("negative numbers:" + negative);
         System.out.println("Zero numbers: " + zero);

       

}
}

           
   
     