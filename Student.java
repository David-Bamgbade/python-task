import java.util.Scanner;

       public class Student {
       public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter student name");
       String student1 = scanner.nextLine();
       
       System.out.println("Enter Score");
       int score1 = scanner.nextInt();
       
       System.out.println("Enter Score");
       int score2 = scanner.nextInt();

       System.out.println("Enter Score");
       int score3 = scanner.nextInt();

       int totalScore;
       totalScore = score1 + score2 + score3;

       if (totalScore < 50) {
       System.out.printf("Student failed by %d", totalScore);
       }

        if (totalScore == 100) {
       System.out.printf("Student passed by %d", totalScore);
       }
        
        if (totalScore > 100) {
       System.out.println("Invlid Score Cannot Calculate");
       }

}
}
       