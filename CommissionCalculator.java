import java.util.Scanner;

public class CommissionCalculator {
public static void main(String[] args){

  Scanner scanner = new Scanner(System.in);

  int salesPersonWeeklySalary = 200;

  System.out.println("Enter Value of items sold:");
  long valueOfItemsSold = scanner.nextLong();

  System.out.println("Enter number of items sold:");
  long numberOfItemsSold = scanner.nextLong();

  long commissionEarningsOnItemSold = numberOfItemsSold * 9 / 100;

  System.out.printf("The commission Earnings On Item Sold is %d%n", commissionEarningsOnItemSold);

  long salesPersonTotalEarnings = scanner.nextLong();

  salesPersonTotalEarnings = salesPersonWeeklySalary + commissionEarningsOnItemSold; 

  System.out.printf("The Sales Person Total Earnings is %d", salesPersonTotalEarnings);

}
}
















