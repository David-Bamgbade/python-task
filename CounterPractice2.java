import java.util.Arrays;
public class CounterPractice2 {
public static void main(String[] args) {

int[] array = {1,2,2,3,4,5,6,76,5,5,3,2,12,};

int mode = 0;

for (int i = 0; i < array.length; i++) {

	if (array[0] == array[1])
	mode++;

}
     System.out.println(mode);
}
}