

public class Main6 {

	public static void main(String[] args) {

		int n = 10;
		int i;

		for (i=0; i<=n; i++){
            if(i%2==0) {
            	System.out.println(i + " - parzysta");
            	
            } else {
                System.out.println(i + " - nieparzysta");
            	
            }
		
		}


         i=1;

         while (i<=n) {
         	
            if(i%2 == 0) {
                System.out.println(i + " - parzysta (while)");
            } else {
                System.out.println(i + " - nieparzysta (while)");
            }
          i++;
         }

	}

}