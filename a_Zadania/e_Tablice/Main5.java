
public class Main5 {

	public static void main(String[] args) {

		int max = Integer.MIN_VALUE; //Dzięki temu przy liczbach ujemnych też zadziała.

		int[] myArr = {-34531, -345, -4, -3, -2, -1, 0};

		for (int i=0; i<myArr.length; i++) {
		
			
			if (myArr[i] > max) {
 				max = myArr[i];
		    }
		
		}
		System.out.println(max);    
			

	}

}

//Co to znaczy uniwersalnie?

