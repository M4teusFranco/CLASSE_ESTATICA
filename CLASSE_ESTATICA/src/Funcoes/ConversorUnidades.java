package Funcoes; // Pacote Funções

// Criação da Classe Abstrata Conversor de Unidades
public abstract class ConversorUnidades {
	double celsius; // Atributos da Classe
	double km;
	double gr;
	
	// Construtor da Classe Conversor de Unidades
	public ConversorUnidades(double celsius, double km, double gr) {
		this.celsius=celsius; // Inicializa os Graus Celsius
		this.km=km; // Inicializa os Quilômetros
		this.gr=gr; // Inicializa os Gramas
	}
	
	
	// Método para Converter Celsius em Fahrenheit
	public static double celsiusParaFahrenheit(double celsius) {
		return celsius *1.8+32; // Retorna os Celcius vezes 1.8 mais 32
	}

	// Método para Converter KM em Milhas
	public static double quilometrosParaMilhas(double km) {
		return km*0.621371; // Retorna os KMs vezes 0.621371
	}

	// Método para Converter Gramas em Libras
	public static double gramasParaLibras(double gr) {
		return gr*0.00220462; // Retorna as Gramas vezes 0.00220462
	}
}