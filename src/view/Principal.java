package view;

import bilbioteca.fila.dinamica.generica.model.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {
		Lista<Integer> A = new Lista<Integer>();
		Lista<Integer> B= new Lista<Integer>();
		
		Lista<Integer> I = new Lista<Integer>();
		Lista<Integer> U= new Lista<Integer>();
		
		A.addFirst(3);
		A.addLast(5);
		A.addLast(8);
		A.addLast(12);
		A.addLast(9);
		A.addLast(7);
		A.addLast(16);
		
		B.addFirst(9);
		B.addLast(6);
		B.addLast(2);
		B.addLast(3);
		B.addLast(7);
		
		//Gerar união enquanto mostra seus valores
		for (int j = 0; j < A.size(); j++) {
			int aux = A.get(j);
			U.addFirst(aux);
			System.out.print(" " + aux + " ");
			if(j < B.size()) {
				aux = B.get(j);
				U.addFirst(aux);
				System.out.print(" " + aux + " ");
			}
		}
		System.out.println(" ");
		
		//Gera intersecção enquanto mostra seus valores
		for (int i = 0; i < A.size(); i++) {
			int a = A.get(0);
			A.removeFirst();
			
			for (int y = 0;  y < B.size(); y++) {
				int b = B.get(0);
				B.removeFirst();
				if(a == b) {
					I.addFirst(a);
					System.out.print(" " + a + " ");
				}
				B.addLast(b);
			}
			A.addLast(a);
		}
		

	}

}
