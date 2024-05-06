import java.util.Scanner;

      public class StoreAppUpgraded {
     	 public static void main(String[] args) {

              Scanner scanner = new Scanner(System.in);

              String Prompt = """
                     Welcome To E-Store
                      """; 

              System.out.println(Prompt);

	      System.out.println("Please Enter Name");
              String Name = scanner.nextLine();              

	      System.out.println("Percentage Discount");
              double percentageDiscount = scanner.nextDouble();

              System.out.println("Please Enter Cost for item or -1 to quit: ");
              int itemsPurchased = scanner.nextInt();

              int sum = 0;

              int counter = 0;

              double discount = sum * percentageDiscount / 100;

              while (itemsPurchased != 0) {
                  System.out.println("Please Enter Cost of item");
                  int costOfItem = scanner.nextInt();
                  counter++;       
                  sum = sum + costOfItem;
                  }

              System.out.printf("Original cost : %d%n", sum);  

              double discountedCost = sum - discount;
              System.out.printf("Discounted cost: %.2f%n", discountedCost);

              System.out.println("Thank You For Your Patronage!"); 
             
      }
   } 
              

              	      
