import java.util.Scanner;
        public class LargestNumber {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int largestNumber = 0;
        int counter = 0;

        while (counter < 10){
        System.out.println("Enter Number");
        int number = scanner.nextInt(); 
        counter++;               
        if (number > largestNumber){
        largestNumber = number;}
}
        System.out.println("largest Number is " + largestNumber);

}
}
       
       