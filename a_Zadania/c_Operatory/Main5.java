
public class Main5 {

	public static void main(String[] args) {
		int a=1, b;
		System.out.println(++a);  //1+1=2
		System.out.println(a++);  //2 - tyle się wyświetli, ale potem doda się jeden i interpreter przejdzie wiersz niżej.
		System.out.println(a);    //3 - wyświetli się 3, bo opereacja inkrementacji wiersz wyżje.
		b=a++; //3, znów wyświetli się trzy, a następnie doda jeden. Najpierw przypisanie, potem kontamentacja. 
		System.out.println(b); //3, wyświetli się akutalna wartość zmiennej.
		b=++a; //4, 
		System.out.println(++a);//5, nie wiem, czemu 6.
	}

}



