package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		
		
		Producto productoA;
		Producto productoB; 
		Producto productoC;
		
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();
		
		productoA.setNombre("Clotrimazol");
		productoA.setDescripcion("Medicamento antifungico");
		productoA.setPrecio(19.99);
		productoA.setStockActual(30);
		
		productoB.setNombre("Aspirina");;
		productoB.setDescripcion("Medicamento antiinflamatorio");
		productoB.setPrecio(8.75);
		productoB.setStockActual(120);
		
		productoC.setNombre("Ibuprofeno");
		productoC.setDescripcion("Medicamento antiinflamatorio");
		productoC.setPrecio(5.75);
		productoC.setStockActual(300);
		
		
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
