import java.util.Scanner;

public class MinuteConverter {
  
       public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
      
       System.out.println("enter the number of minutes");
       
       long minutes = input.nextLong();
       
       long years = minutes / (60 * 24 * 365);

       long days = minutes / 1400;
       
       System.out.println(minutes + " minutes is approximately " + years + "years and " + days + " days.");         
 
  }   

}

       
       

       