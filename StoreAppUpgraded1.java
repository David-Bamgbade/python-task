import java.util.Scanner;

      public class StoreAppUpgraded1 {
     	 public static void main(String[] args) {

              Scanner scanner = new Scanner(System.in);

              String Prompt = """

                     WELCOME TO E-STORE

                       """;

              System.out.print(Prompt);

              System.out.println("Please Enter Name");
              String Name = scanner.nextLine();

              System.out.println("What Is The Name Of item1");
              String productName1 = scanner.nextLine();

              System.out.println("How much Is It");
              int costOfItem1 = scanner.nextInt();
         
              System.out.println("What Is The Name Of item2");

              scanner.nextLine();

              String productName2 = scanner.nextLine(); 

              System.out.println("How much Is It");
              int costOfItem2 = scanner.nextInt();

              System.out.println("What Is The Name Of item3");

              scanner.nextLine();

       	      String productName3 = scanner.nextLine();

              System.out.println("How much Is It");
              int costOfItem3 = scanner.nextInt();

              int sum = costOfItem1 + costOfItem2 + costOfItem3; 

              double discount = sum * 10 / 100;

              double discountedCost = sum - discount;

              String space = "     ";
              String space1= "        ";
              System.out.println("Total" + space + "cost");
              System.out.println(productName1 + space1 + costOfItem1);
              System.out.println(productName2 + space1 + costOfItem2);
              System.out.println(productName3 + space1 + costOfItem3);
              System.out.print(space);
              System.out.print(space1);

              System.out.print("Total cost: " + sum);
             
              if (sum >= 200) {
                  System.out.println("Discounted cost: " + discountedCost);
                  }
        
              System.out.print("Thanks For Your Patronage!");


}             
}