import java.util.Arrays;
public class PositionArray {
	public static void main(String[] args) {

	int[] array = {6,9,1,2,3};
	int max = 0;

	for (int i = 0; i < array.length; i++){
	for (int j = 0; j < array.length; j++){
	if (array[i] > max) {
		max = array[i];	
	    }
          }
	}
	System.out.println(Arrays.toString(array));


}
}