package exercicios.poo;

public class Triangle {

	/* Declaração dos Atributos */
	public double a; /* public permite que ela pode ser acessada em outros arquivos */
	public double b;
	public double c;

	/*
	 * neste metodo, a area nao recebe nenhum parametro pois os que serao usados pra
	 * calcular a area de um triangulo já estao dentro desta classe, que é a, b, c
	 */
	public double area() {

		double p = (a + b + c) / 2.0;
		return Math.sqrt(
				p * (p - a) * (p - b) * (p - c)); /* aqui é solicitado que retorne direto o resultado da formula */
	}

}
