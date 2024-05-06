import java.util.Scanner;

      public class StoreApp {
      public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter Name");
      String Name = scanner.nextLine();

      int counter = 0;

      int sum = 0;    

      while (counter < 10) {
      
      System.out.println("Enter Price ");
      int priceOfItem = scanner.nextInt();

      sum = sum + priceOfItem;       

      counter++;      
      }
      System.out.printf("The total cost is %d%n", sum);

      int discount = sum * 10 / 100;

      if (sum >= 200) {
        sum = sum - discount;

      System.out.printf("The price after discount is %d%n", sum);
      }

        
}
} 
      