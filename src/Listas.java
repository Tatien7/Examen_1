import java.util.ArrayList;
import java.util.Collections;

import java.util.List;


public class Listas {

	public static void main(String[] args) {
	

		List<Integer> lista = new ArrayList<>();
	
		lista.add(1); // [ 1 ]
		lista.add(1); // [ 1, 2]
		lista.add(10);// [ 1, 2, 3]
		
		System.out.println(lista.get(2));
	
		lista.set(1, 3);// [ 1, 3, 2]
		
		lista.remove(0);// [ 3, 1]

		System.out.println(lista);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);
		



		Collections.sort(listaNumeros);
		System.out.println(listaNumeros.get(1));

		List<String> listaNumerosString = new ArrayList<>();
		listaNumerosString.add("1");
		listaNumerosString.add("2");
		listaNumerosString.add("3");
		

		listaNumerosString.sort((a, b) -> {
			Integer a1 = Integer.parseInt(a);
			Integer b1 = Integer.parseInt(b);
			return b1.compareTo(a1);
		});
		System.out.println(listaNumerosString.get(1));

	}
}
