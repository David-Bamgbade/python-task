import java.util.Scanner;

	public class Array {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
             
	String[] names = new String[5];

        int counter = 0;
        int count = 0;

         for (counter = 0; counter < 5; counter++){
             System.out.println("Enter name: ");
              String name = scanner.nextLine();
              names[counter] = name;
              }
             

        for (count = 0; count < 5; count++) {    
          System.out.println(names[count]);
          }   

}
}

