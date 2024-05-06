import java.util.Scanner;

      public class StoreAppUpgrade {
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
  
              if (percentageDiscount == 0) {
                  System.out.println("No Discount Added");   
                  }      

              int counter = 0;

              System.out.println("Please Enter Number Of Items Purchased");
              int itemsPurchased = scanner.nextInt();

              int sum = 0;

              while (counter < itemsPurchased) {
                  System.out.println("Please Enter Cost of item");
                  int costOfItem = scanner.nextInt();
                  counter++;       
                  sum = sum + costOfItem;
                  }
  
              System.out.printf("Original cost : %d%n", sum);  

              double discount = sum * percentageDiscount / 100;     

              double discountedCost = sum - discount;
              System.out.printf("Discounted cost: %.2f%n", discountedCost);

              System.out.println("Thank You For Your Patronage!"); 
             
      }
   } 
      