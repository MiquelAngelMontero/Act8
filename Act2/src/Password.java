/**
 * 
 * @author Miquel Angel Montero
 *
 */
public class Password {
	
	//Atributos
	private int longitud;
	private int contraseña;
	
	
	//Constructores
	//Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.contraseña = generarContra(longitud);
	}

	//Constructor con parametros
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContra(longitud);
	}
	
	
	//Metodo para generar contraseña
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
	public int getContraseña() {
		return contraseña;
	}	
}
