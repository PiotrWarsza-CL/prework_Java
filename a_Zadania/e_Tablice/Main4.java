
public class Main4 {

	public static void main(String[] args) {


      int sOdd = 0;
      int amount = 0;
 			int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 		
 			for (int i = 0; i < numbers.length; i++) {
 				if (numbers[i] % 2 == 0) {
 					System.out.println(numbers[i] + "  parzysta");
 				} else {
 					sOdd += numbers[i];
 					System.out.println(numbers[i] + "  nieparzysta");
 					amount++;	
 				}	
 			}
 			
 			System.out.println("Suma liczb nieparzystych to: " + sOdd + " . Jest ich -> " + amount);
 

	}

}
