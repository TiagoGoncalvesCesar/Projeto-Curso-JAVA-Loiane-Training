package classe_metodos_com_parametros;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	double obterAutonomia(){
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
	double calcularCombustive(double km) {
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}
}
