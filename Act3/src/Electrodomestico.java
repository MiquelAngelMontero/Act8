/**
 * 
 * @author Miquel Angel Montero
 *
 */
public class Electrodomestico {

	//Atributos
	private double precioBase;
	private String color;
	private int consumoE;
	private double peso;
	
	
	//Constructores
	//Constructor por defecto
	public Electrodomestico() {
		this.precioBase = 100;
		this.color = "blanco";
		this.consumoE = 6;
		this.peso = 5;
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
	
}
