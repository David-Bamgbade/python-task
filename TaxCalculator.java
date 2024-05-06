import java.util.Scanner;

public class TaxCalculator {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("Enter citizen earnings:");
int citizenEarnings = scanner.nextInt();

if (citizenEarnings <= 30000) {
   double CitizenTotalTax = citizenEarnings * 0.15;
   System.out.printf("Citizen Total Tax is %f", CitizenTotalTax);
}
   
if (citizenEarnings > 30000) {
   double CitizenTotalTax = citizenEarnings * 0.20;
   System.out.printf("Citizen Total Tax is %f", CitizenTotalTax);
}

  }
}