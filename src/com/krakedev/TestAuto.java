package com.krakedev;

public class TestAuto {
	
	public static void main(String[] args) {
		
		Auto auto1 = new Auto("Chevrolet", 2019,23.900);
		Auto auto2 = new Auto("Toyota", 2022, 15.956);


		System.out.println("----------------");
		System.out.println("Marca del auto 1:" + " " + auto1.getMarca());
		System.out.println("Anio del auto 1:" + " " + auto1.getAnio());
		System.out.println("Precio del auto 1:" + " " + auto1.getPrecio());

		System.out.println("----------------");
		System.out.println("Marca del auto 2:" + " " + auto2.getMarca());
		System.out.println("Anio del auto 2:" + " " + auto2.getAnio());
		System.out.println("Precio del auto 2:" + " " + auto2.getPrecio());
	}

}
