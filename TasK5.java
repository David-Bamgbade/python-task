public class TasK5 {

public static int[] OddnumberIn(int[] array) {

int[] numbers = new int[10];

for (int counter = 0; counter < numbers.length; counter = counter + 3) {
     numbers[counter] = array[counter];

     }
    
        return numbers;
}
}


