/**
 * 
 * @author Miquel Angel Montero
 *
 */
public class Password {
	
	//Atributos
	private int longitud;
	private int contrase�a;
	
	
	//Constructores
	//Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.contrase�a = generarContra(longitud);
	}

	//Constructor con parametros
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = generarContra(longitud);
	}
	
	
	//Metodo para generar contrase�a
	public int generarContra(int longitud) {
		String contrasenyaS = "";
				
		for (int i = 0; i<longitud; i++) {
			int valor = (int) (Math.random() * (9 - 0));
			String valorS = Integer.toString(valor);
			contrasenyaS = contrasenyaS + valorS;
		} 
		
		int contrasenya = Integer.parseInt(contrasenyaS);
		
		return contrasenya;
		 
	}
	
	//Getters & Setters
	public int getContrase�a() {
		return contrase�a;
	}	
}
