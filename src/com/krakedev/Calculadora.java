package com.krakedev;

public class Calculadora {
	
	private double valor1;
	private double valor2;
	private double valor3;
	
	
	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	

	public double getValor3() {
		return valor3;
	}

	public void setValor3(double valor3) {
		this.valor3 = valor3;
	}

	public double multiplicar(double valor1, double valor2) {
		double producto = valor1 * valor2;
		return producto;
	}

	public double dividir(double dividendo, double divisor) {
		double cociente = dividendo / divisor;
		return cociente;
	}

	public double promediar(double valor1, double valor2, double valor3) {
		double promedioTotal = (valor1 + valor2 + valor3) / 3;
		return promedioTotal;
	}

	public void mostrarResultado() {
		System.out.println("Ahorita no joven, Sali al almuerzo. Regreso en 15 minutos");
	}

}
