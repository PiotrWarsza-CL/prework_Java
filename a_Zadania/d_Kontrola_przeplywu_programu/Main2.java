
public class Main2 {

    public static void main(String[] args) {

    	byte nr1 = 23;
	    byte nr2 = 47;
	    byte nr3 = 44;




	    if (nr1 > nr2 && nr1 > nr2) {
	    	System.out.println("Największa liczba z " + nr1 + ", " + nr2 + ", " + nr3 + " to: " + nr1);
	    } else if (nr2 > nr1 && nr2 > nr3) {
	    	System.out.println("Największa liczba z " + nr1 + ", " + nr2 + ", " + nr3 + " to: " + nr2);
	    } else if (nr3 > nr1 && nr3 > nr2) {
	    	System.out.println("Największa liczba z " + nr1 + ", " + nr2 + ", " + nr3 + " to: " + nr3);
	    } else {
	    	System.out.println("Żadna z liczb nie jest największa");
	    }
    }

}
