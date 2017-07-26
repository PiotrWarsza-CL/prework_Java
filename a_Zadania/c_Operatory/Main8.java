
public class Main8 {

	public static void main(String[] args) {

		byte x = 16;
	    byte y = 15;
	    boolean x_y = x < y;
	    boolean t = true;
	    boolean f = false;
	    boolean t_f = t || f; // prawda lub fałsza = prawda 
        boolean last = t && f; // prawda i fałsz = fałsz

        System.out.println(x_y);
 		System.out.println(t_f);
 		System.out.println(last);
	    


	}

}
