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

              sum = sum + itemsPurchased;

              double discount = sum * percentageDiscount / 100;

              double discountedCost = sum - discount;

              while (counter < itemsPurchased) {
                     System.out.println("Please Enter Cost for item or -1 to quit: "); 
                     int costOfItem = scanner.nextInt(); 
                     counter++; 
                             
                        if (costOfItem == -1) {
		           System.out.printf("Original cost : %d%n", sum);
                           System.out.printf("Discounted cost: %.2f%n", discountedCost);
               	           System.out.println("Thank You For Your Patronage!"); 
                            break;
                           }
                        }     
                             if (itemsPurchased == -1) {
                              System.out.printf("Original cost : %d%n", sum);
                              System.out.printf("Discounted cost: %.2f%n", discountedCost);
               	              System.out.println("Thank You For Your Patronage!"); 
                              }
                             


      }
   } 
              

              	      
