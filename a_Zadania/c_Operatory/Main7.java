
public class Main7 {

    public static void main(String[] args) {
	    byte nr1 = 7;
	    byte nr2 = 4;
	    int result = nr1 + nr2;
        System.out.println(result);	    
	    nr1 = 10; //Zmienna została nadpisana, obecna wartość to 10, stąd wynik działania poniższego inny niż powyższego.
	    result = nr1 + nr2;
        System.out.println(result);

	}
}
