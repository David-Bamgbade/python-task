import java.util.Scanner;

       public class Grade {
       public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
    
       System.out.println("Enter student name");
       String student = scanner.nextLine();

       System.out.println("Enter Score");
       int score1 = scanner.nextInt();

       System.out.println("Enter Score");
       int score2 = scanner.nextInt();

       System.out.println("Enter Score");
       int score3 = scanner.nextInt();

       String A;
       String B;
       String C;
       String D;
         
       int a = 80;
       int b = 70;
       int c = 50;
       int d = 40;
     
       int totalScore = score1 + score2 + score3;

        if (totalScore >  100) {
       System.out.println("invalid Score can't calculate");
       }     
    
       else if ((totalScore >= 80) | (totalScore == 100)) {
       System.out.printf("%s passed by A and your score is %d", student, totalScore);
       }

       else if ( totalScore > 70) {
       System.out.printf("%s passed by B and your score is %d", student, totalScore);
       }
 
       else if (totalScore > 50) {
       System.out.printf("%s passed by C and your score is %d", student, totalScore);
       }
 
         else if (totalScore > 40) {
       System.out.printf("%s passed by D and your score is %d", student, totalScore);
       }

        else if (totalScore < 40) {
       System.out.printf("%s failed by D and your score is %d", student, totalScore);
       }

}
}

       

       

       