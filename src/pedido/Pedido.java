package pedido;

import java.util.ArrayList;

import composite.Composite;
import composite.Leaf;

public class Pedido {
	
	
	public void pedido(ArrayList<Integer> orden, ArrayList<String> especificaciones) {
		float precioFinal=0;
		String factura="--------------------------------------------------------\n\tRestaurante Comidas Rapidas\n\tResumen factura\n";
		
		Composite pedido = new Composite("PEDIDO");
		Composite perro = new Composite("Perro Caliente");
		Composite hamburguesa = new Composite("Hamburguesa");
		Composite pizza = new Composite("Pizza");
		int aux = 0;
		for (int i = 0; i < orden.size(); i+=3) {
			if(orden.get(i)==1) {
				if(orden.get(i+1) == 1) {
					Leaf carne = new Leaf("Hamburguesa carne sencilla", 8000);
					hamburguesa.hijos.add(carne);
				}else if(orden.get(i+1) == 2) {
					Leaf carne = new Leaf("Hamburguesa carne doble", 12000);
					hamburguesa.hijos.add(carne);
				}else if(orden.get(i+1) == 3) {
					Leaf carne = new Leaf("Hamburguesa carne triple", 15000);
					hamburguesa.hijos.add(carne);
				}
				factura += hamburguesa.executeName()+" "+especificaciones.get(aux)+"    $"+hamburguesa.execute();
				pedido.hijos.add(hamburguesa);
			}else if(orden.get(i)==2) {
				if (orden.get(i+1) ==1) {
					Leaf tipoPerro = new Leaf("Perro caliente clasico", 7000);
					perro.hijos.add(tipoPerro);
				}else if (orden.get(i+1) ==2) {
					Leaf tipoPerro = new Leaf("Perro caliente especial", 10000);
					perro.hijos.add(tipoPerro);
				}else if (orden.get(i+1) ==3) {
					Leaf tipoPerro = new Leaf("Perro caliente super especial", 13000);
					perro.hijos.add(tipoPerro);
				}
				factura += perro.executeName()+" "+especificaciones.get(aux)+"     $"+perro.execute();
				pedido.hijos.add(perro);
			}else if(orden.get(i)==3) {
				if (orden.get(i+1) ==1) {
					Leaf tipoPizza = new Leaf("Pizza carnes", 6000);
					pizza.hijos.add(tipoPizza);
				}else if (orden.get(i+1) ==2) {
					Leaf tipoPizza = new Leaf("Pizza hawaihana", 6000);
					pizza.hijos.add(tipoPizza);
				}else if (orden.get(i+1) ==3) {
					Leaf tipoPizza = new Leaf("Pizza pollo con champi�ones", 6000);
					pizza.hijos.add(tipoPizza);
				}
				factura += pizza.executeName()+" "+especificaciones.get(aux)+"     $"+pizza.execute();
				pedido.hijos.add(pizza);
			}
			if (orden.get(i+2)==1) {
				Composite combo = new Composite("Combo Papas y Gaseosa");
		        Leaf papas = new Leaf("papas",4000);
		        Leaf gaseosa = new Leaf("gaseosa",4000);
		        combo.hijos.add(gaseosa);
		        combo.hijos.add(papas);
		        pedido.hijos.add(combo);
		        factura += "\n"+combo.executeName()+"    $"+combo.execute()+"\n \n";
			}
			precioFinal += pedido.execute();
			hamburguesa.hijos.clear();
			perro.hijos.clear();
			pizza.hijos.clear();
			aux++;
		}
		
		System.out.println(factura);
		System.out.println("PRECIO FINAL: "+precioFinal);
		
	}

}
