/**
 * 
 * @author Miquel Angel Montero
 *
 */
public class PasswordApp {

	public static void main(String[] args) {
		
		//Creamos una contrasenya por cada tipo de constructor
		Password p1 = new Password();
		Password p2 = new Password(5);
		
		System.out.println(p1.getContraseña());
		System.out.println(p2.getContraseña());

	}

}
