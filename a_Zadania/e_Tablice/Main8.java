
public class Main8 {

	public static void main(String[] args) {
		double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
        
		int i;
		double farenh1 = 1.8;
		int farenh2 = 32;


        for (i=0; i<temps.length; i++) {
		  	temps[i]=temps[i]*farenh1+farenh2;
		  	System.out.print(temps[i] + ", ");
		}

	System.out.print(temps);	
	}

}
