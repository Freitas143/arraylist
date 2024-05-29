package bjhjjhiojçlinujinkljkjkl;

import java.util.ArrayList;

public class Dnobo {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		int soma = 0;
		
		numeros.add(5);
		numeros.add(25);
		numeros.add(7);
		numeros.add(98);
		numeros.add(6);
		
		for(int numero : numeros) {
			soma = soma + numero;
		}
		System.out.println(soma);
	}

}
