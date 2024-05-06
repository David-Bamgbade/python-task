public class Drill {

public static void myMethod() {

int[] collection = {1,2,2,2,3};

int maximum = 0;

for(int i = 0; i < collection.length; i++) {
	if (collection[i] > maximum) {
	maximum = collection[i];
	  }
	}
	
	System.out.println(maximum);
}
}

