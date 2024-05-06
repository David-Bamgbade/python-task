public class TasK4 {

public static int[] EvennumberIn(int[] array) {

int[] numbers = new int[5];
int j = 0;

for (int counter = 0; counter < numbers.length; counter = counter + 2) {
        
        numbers[counter] = array[counter];	

      }

      return numbers;
}
}