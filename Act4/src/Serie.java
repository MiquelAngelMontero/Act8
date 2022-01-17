/**
 * 
 * @author Miquel Angel Montero
 *
 */
public class Serie {
	
	//Atributos
	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	
	//Constructores
	//Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	//Constructor con titulo y creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	//Constructor completo
	public Serie(String titulo, int temporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}	
}
