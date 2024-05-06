import java.util.Scanner;

       public class Score {
       public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter Score1");
       int score1 = scanner.nextInt();

       System.out.println("Enter Score2");
       int score2 = scanner.nextInt();
       

       System.out.println("Enter Score3");
       int score3 = scanner.nextInt();

       int totalScore;
       totalScore = score1 + score2 + score3;
       
       if (totalScore > 50) {
       System.out.printf("Student passed by %d", totalScore);
       }

       if (totalScore < 50) {
       System.out.printf("Student failed by %d", totalScore);
       }
      
















}
}

       