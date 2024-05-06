import java.util.Arrays;

public class Array4 {
public static void main(String[] args) {
  
int[] collection = new int[] {2,4,5,1,6};
int sum = 0;
int number = 0;

for (int counter = 0; counter < 5; counter++) {
sum = sum + collection[counter];
}
     System.out.println(sum);

for (int count = 0; count < 5; count++) {
number = sum - collection[count];
}
  System.out.println(Arrays.toString(number));    

}
}