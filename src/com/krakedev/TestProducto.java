package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {

		Producto productoA = new Producto("Clotrimazol", "Medicamento antifungico", 19.99, 30);
		Producto productoB = new Producto("Aspirina", "Medicamento antiinflamatorio", 8.75, 120);
		Producto productoC = new Producto("Ibuprofeno", "Medicamento antiinflamatorio", 5.75, 300);

		System.out.println("---------------");
		System.out.println("Nombre:" + productoA.getNombre());
		System.out.println("Descripcion:" + productoA.getDescripcion());
		System.out.println("Precio $:" + productoA.getPrecio());
		System.out.println("Stock Actual:" + productoA.getStockActual());

		System.out.println("---------------");

		System.out.println("Nombre:" + productoB.getNombre());
		System.out.println("Descripcion:" + productoB.getDescripcion());
		System.out.println("Precio $:" + productoB.getPrecio());
		System.out.println("Stock Actual:" + productoB.getStockActual());

		System.out.println("---------------");
		System.out.println("Nombre:" + productoC.getNombre());
		System.out.println("Descripcion:" + productoC.getDescripcion());
		System.out.println("Precio $:" + productoC.getPrecio());
		System.out.println("Stock Actual:" + productoC.getStockActual());
	}

}
