import java.util.Arrays;
public class ArrayMultiplication {
	public static void main(String[] args) {

	int[] array = {-6,-9,1,2,3, -8};
	int result = 0;
	int maximum = 0;

	for(int i = 0; i < array.length; i++) {
	for(int j = 0; j < array.length; j++) {
	if (array[i] != array[j]);
	else {break;}
	result = array[i] * array[j];	
	if (result > maximum){
	maximum = result;
	}

    }
}

		System.out.println("Maximum is:" + maximum);	 

	



 }
}



	