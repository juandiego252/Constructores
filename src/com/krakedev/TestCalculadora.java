package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora operaciones = new Calculadora();
		
		operaciones.setValor1(10);
		operaciones.setValor2(4);
		operaciones.setValor3(12);
		
		double multiplicacion = operaciones.multiplicar(operaciones.getValor1(), operaciones.getValor2());
		double division = operaciones.dividir(operaciones.getValor1(), operaciones.getValor2());
		double promedio = operaciones.promediar(operaciones.getValor1(), operaciones.getValor2(), operaciones.getValor3());
		
		System.out.println("Resultado Multiplicacion:" + multiplicacion);
		System.out.println("Resultado Dividir:" + division);
		System.out.println("Resultado Promedio:" + promedio);
		operaciones.mostrarResultado();
	}

}
