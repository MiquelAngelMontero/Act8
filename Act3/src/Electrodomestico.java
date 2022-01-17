/**
 * 
 * @author Miquel Angel Montero
 *
 */
public class Electrodomestico {
	
	private final double PRECIOBASE = 100;
	private final String COLOR = "blanco";
	private final int CONSUMOE = 6;
	private final double PESO = 5;
	
	//Atributos
	private double precioBase = PRECIOBASE;
	private String color = COLOR;
	private int consumoE = CONSUMOE;
	private double peso = PESO;
	
	
	//Constructores
	//Constructor por defecto
	public Electrodomestico() {
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumoE = CONSUMOE;
		this.peso = PESO;
	}

	
	//Constructor con precio y peso
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = "blanco";
		this.consumoE = 6;
		this.peso = peso;
	}

	
	//Constructor completo
	public Electrodomestico(double precioBase, String color, int consumoE, double peso) {
		this.precioBase = precioBase;
		this.color = comprovarColor(color);
		this.consumoE = comprovarConsumo(consumoE);
		this.peso = peso;
	}
	
	//Metodos
	//Metodo para comprovar color
	public String comprovarColor(String colorIntr) {
		
		String colorIntrMin = colorIntr.toLowerCase();
		switch (colorIntrMin) {
		
			case "blanco":
				return colorIntr;
			case "negro":
				return colorIntr;
			case "rojo":
				return colorIntr;
			case "azul":
				return colorIntr;
			case "gris":
				return colorIntr;
			default:
				return "blanco";
		}
		
	}
	
	//Metodo para comprovar consumo
	public int comprovarConsumo(int consumo) {
		
		if((consumo >= 1) && (consumo <= 6)) {
			return consumo;
		}else {
			return 6;
		}
		
	}


	@Override
	public String toString() {
		return "Electrodomestico [PRECIOBASE=" + PRECIOBASE + ", COLOR=" + COLOR + ", CONSUMOE=" + CONSUMOE + ", PESO="
				+ PESO + ", precioBase=" + precioBase + ", color=" + color + ", consumoE=" + consumoE + ", peso=" + peso
				+ "]";
	}
	
}
