import java.util.Arrays;
public class CollectArray {
	public static void main(String[] args) {
	
	int[] array = {2,9,3,1,6};

	for (int i = 0; i < array.length; i++) {		
	for(int j = 0; j < array.length; j++) {
	if(array[i] < array[j]) {
		array[i] = array[i] + array[j];
		array[j] = array[i] - array[j];
		array[i] = array[i] - array[j];
	}
     }
  }
 	 
	System.out.print(Arrays.toString(array));	

}
}

	