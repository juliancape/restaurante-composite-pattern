  package composite;

import java.util.ArrayList;
import java.util.Scanner;

import pedido.Pedido;

public class Launcher {
    public static void main(String[] args){
    	Scanner leer = new Scanner(System.in);
    	int pedido = 1;
    	while(true) {
    		System.out.println("Pedido numero: "+pedido);
    		caja();
    		pedido ++;
    	}
    	
    	
    }
    
    public static void caja() {
        Boolean flag = true;
        Scanner leer = new Scanner(System.in);
        int total;
        Pedido pedidoComida = new Pedido();
        ArrayList<Integer> pedidos = new ArrayList<>();
		ArrayList<String> observaciones = new ArrayList<>();
    	while(flag) {
    		System.out.println("Restaurante comidas rapidas");
    		System.out.println("1.Hamburguesa\n2.Perro caliente\n3.Pizza");
    		System.out.print("Digite opcion:");
    		int principal = leer.nextInt();
    		int especificacion;
    		int combo;
    		if(principal == 1) {
    			System.out.println("-----HAMBURGUESA-----");
    			System.out.println("1. Hamburguesa clasica\n2. Hamburguesa doble carne\n"
    					+ "3. Hamburguesa triple carne");
    			System.out.print("Digite opcion:");
    			especificacion = leer.nextInt();
    			System.out.println("�En combo?(Papas y gaseosa)\n1. Si\n2. No");
    			System.out.print("Digite opcion:");
    			combo = leer.nextInt();
    			pedidos.add(principal);
    			pedidos.add(especificacion);
    			pedidos.add(combo);
    		}else if(principal == 2) {
    			System.out.println("-----PERRO CALIENTE-----");
    			System.out.println("1. Perro caliente clasico\n2. Perro caliente especial\n"
    					+ "3. Perro caliente super especial");
    			System.out.print("Digite opcion:");
    			especificacion = leer.nextInt();
    			System.out.println("�En combo?(Papas y gaseosa)\n1. Si\n2. No");
    			System.out.print("Digite opcion:");
    			combo = leer.nextInt();
    			pedidos.add(principal);
    			pedidos.add(especificacion);
    			pedidos.add(combo);
    		}else if(principal == 3) {
    			System.out.println("-----PIZZA-----");
    			System.out.println("1. Pizza carnes\n2. Pizza hawaihana\n"
    					+ "3. Pizza pollo con champi�ones");
    			System.out.print("Digite opcion:");
    			especificacion = leer.nextInt();
    			System.out.println("�En combo?(Papas y gaseosa)\n1. Si \n2. No ");
    			System.out.print("Digite opcion:");
    			combo = leer.nextInt();
    			pedidos.add(principal);
    			pedidos.add(especificacion);
    			pedidos.add(combo);
    		}
    		System.out.print("Especificaciones del producto (o dejar en blanco):");
    		String observacion = leer.next();
    		observaciones.add(observacion);
    		
    		System.out.println("Ingresar otro producto en este pedido\n1. SI\n2. NO");
    		int otro = leer.nextInt();
    		if(otro ==2) {
    			int n_mesa = 0;
    			System.out.print("Ingrese numero de mesa: ");
    			n_mesa = leer.nextInt();
    			System.out.println("");
    			pedidoComida.pedido(pedidos, observaciones);
    			System.out.println("Numero de Mesa: "+ n_mesa);
    			int pago = 0;
    			System.out.println("------------------------------\nForma de pago:"
    					+ "\n1. Efectivo\n2. Tarjeta\n3. Cartera digital");
    			pago = leer.nextInt();
    			if (pago ==1 ) {
					System.out.println("Recibir efectivo");
				}
    			else {
    				String n_cuenta = "";
    				System.out.print("Ingrese numero de la cuenta:");
    				n_cuenta = leer.next();
    				System.out.println("Realizando transaccion\n \n");
    			}
    			
    			flag=false;
    		}
    	}
    	
    }
    
}
