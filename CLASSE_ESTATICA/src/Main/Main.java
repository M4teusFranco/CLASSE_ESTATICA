package Main; // Pacote Main
import Funcoes.ConversorUnidades; // Importa a Classe Conversor Unidades do Pacote Funções 

public class Main {

	public static void main(String[] args) {
		
		// Trecho que exibe a Conversão dos Celsius para Fahrenheit
		System.out.println("Celsius para Fahreinheit");
		double ResultadoCelsius = ConversorUnidades.celsiusParaFahrenheit(30); // Insere o Valor dos Celsius
		System.out.println("30 Graus Celsius são "+ResultadoCelsius+" Fahreinheit"); // Exibe o Resultado

		// Trecho que exibe a Conversão dos KM para Milhas
		System.out.println("\nKM para Milhas");
		double ResultadoKM = ConversorUnidades.quilometrosParaMilhas(15);// Insere o Valor dos KMs
		System.out.println("15 KM são "+ResultadoKM+" Milhas"); // Exibe o Resultado

		// Trecho que exibe a Conversão das Gramas para Libras
		System.out.println("\nGramas para Libras");
		double ResultadoGR = ConversorUnidades.gramasParaLibras(40); // Insere o Valor das Gramas
		System.out.println("40 Gramas são "+ResultadoGR+" Libras"); // Exibe o Resultado
		
	}

}