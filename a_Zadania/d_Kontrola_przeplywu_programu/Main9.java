
public class Main9 {

	public static void main(String[] args) {
	    //definicja zmiennej z ilością rzędów i gwiazdek w wierszu
	    int n = 5;

	    for (int i = 0; i < n; i++) {
	        String row = "";//zmienna która jest zerowana na początku każdej iteracji, przechowująca gwiazdki z wiersza

	        //tworzymy pętlę generującą nam gwiazdki w wierszu
	        for (int j = 0; j < n; j++) {
	            
                if(i>=j) {

	              row = "*";

	              System.out.print(row);
	            
	            } else {

	              System.out.print(j + 1);
	            
	            }

	        }
	        System.out.print("\n");//wyświetlamy gwiazdki z wiersza i dodajemy znak nowej linii
	    }
	}

}
