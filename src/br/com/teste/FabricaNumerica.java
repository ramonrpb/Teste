package br.com.teste;

import java.util.Scanner;

public class FabricaNumerica {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de A");
		Integer a = entrada.nextInt();
		
		System.out.println("Digite o valor de B");
		Integer b = entrada.nextInt();

		String valorA = a.toString();
		String valorB = b.toString();
		StringBuilder valorC = new StringBuilder();
		
		int tamanhoA = valorA.length();
		int tamanhoB = valorB.length();
		
		if(tamanhoA < tamanhoB) {
			montarNumero(valorA, valorB, valorC, tamanhoA);
			valorC.append(valorB.substring(tamanhoA));
		}else if(tamanhoB < tamanhoA) {
			montarNumero(valorA, valorB, valorC, tamanhoB);
			valorC.append(valorA.substring(tamanhoB));
		}else {
			montarNumero(valorA, valorB, valorC, tamanhoA);
		}
		
		Integer validacao = Integer.valueOf(valorC.toString());
		if(validacao > 1000000){
			System.out.println(-1);
		}else {
			System.out.println("O valor de C é "+valorC);
		}
	}

	private static void montarNumero(String valorA, String valorB, StringBuilder valorC, int tamanhoA) {
		for(int i = 0; i < tamanhoA; i++) {
			valorC.append(valorA.substring(i, i+1));
			valorC.append(valorB.substring(i, i+1));
		}
	}

}
