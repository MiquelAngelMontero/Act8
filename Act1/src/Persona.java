/**
 * 
 * @author Miquel Angel Montero
 *
 */
public class Persona {
	
	//Atributos
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	//Constructores
	//Constructor por defecto
	public Persona(String dni) {
		this.nombre = "";
		this.edad = 0;
		this.dni = dni;
		this.sexo = 'H';
		this.peso = 0;
		this.altura = 0;
		
	}
	
	//Constructor con nombre edad , sexo y DNI
	public Persona(String nombre, int edad, String dni, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}
	
	//Constructor con todos los elementos
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
}
