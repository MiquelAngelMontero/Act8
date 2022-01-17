/**
 * 
 * @author Miquel Angel Montero
 *
 */
public class SerieApp {

	public static void main(String[] args) {
		
		//Creamos un objeto para cada constructor
		Serie s1 = new Serie();
		Serie s2 = new Serie("Spiderman", "Miquel Angel");
		Serie s3 = new Serie("Cars", 4, "Aventura", "Juan");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
	}

}
