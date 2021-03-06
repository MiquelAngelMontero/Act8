/**
 * 
 * @author Miquel Angel Montero
 *
 */
public class Serie {
	
	private final boolean ENTREGADO = false;
	private final int TEMPORADAS = 3;
	
	//Atributos
	private String titulo;
	private int temporadas = TEMPORADAS;
	private boolean entregado = ENTREGADO;
	private String genero;
	private String creador;

	
	//Constructores
	//Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.temporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = "";
	}

	//Constructor con titulo y creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = creador;
	}

	//Constructor completo
	public Serie(String titulo, int temporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [ENTREGADO=" + ENTREGADO + ", TEMPORADAS=" + TEMPORADAS + ", titulo=" + titulo + ", temporadas="
				+ temporadas + ", entregado=" + entregado + ", genero=" + genero + ", creador=" + creador + "]";
	}
	
}
