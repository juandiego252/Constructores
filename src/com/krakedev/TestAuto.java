package com.krakedev;

public class TestAuto {
	
	public static void main(String[] args) {
		Auto auto1 = new Auto(); // Instanciar auto1
		Auto auto2 = new Auto(); // Instanciar auto2

		auto1.setMarca("Chevrolet");;
		auto1.setAnio(2019);
		auto1.setPrecio(23.900);

		auto2.setMarca("Toyota");
		auto2.setAnio(2022);
		auto2.setPrecio(15.956);

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
