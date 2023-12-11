package com.krakedev;

public class TestRectangulo {
	public static void main(String[] args) {
		Rectangulo rec1 = new Rectangulo(4, 2);
		Rectangulo rec2 = new Rectangulo(6, 3);

		System.out.println("El perimetro del rectangulo 1 es:" + rec1.calcularPerimetro());
		System.out.println("El perimetro del rectangulo 2 es:" + rec2.calcularPerimetro());
	}

}
