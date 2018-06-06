package br.com.teste;

import java.util.Scanner;

public class ArvoreBinaria {

	private static BinaryTree noEncontrado;

	public static void main(String[] args) {
		
		BinaryTree raiz = new BinaryTree(3);
		System.out.println("Quantos número terá na árvore?");
		Scanner entrada = new Scanner(System.in);
		int quantidade = entrada.nextInt();
		int total = 1;
		while(total <= quantidade) {
			System.out.println("Entre com o valor Nº "+total+": ");
			inserir(raiz, entrada.nextInt());
			total++;
		}
		
		System.out.println(" ---------------------------------------------------- ");
		System.out.println();
		System.out.println("A partir de qual valor você deseja obter a soma?");
		int noDesejado = entrada.nextInt();
		buscar(raiz, noDesejado);
        if(null != noEncontrado) {
        	System.out.println("Os valores encontrados a partir do nó "+noDesejado+" são:");
        	System.out.println(" ---------------------------------------------------- ");
    		System.out.println();
        	System.out.println("A soma dos valores subsequentes do nó "+noDesejado+" é: "+ noEncontrado.soma());
        }else {
        	System.out.println("Não existem valores abaixo do nó pesquisado.");
        }
	}
	
	public static void inserir(BinaryTree raiz, int valor) {
		   if (raiz != null) {
		    if (valor < raiz.valor) {
		        if (raiz.left != null) {
		            inserir(raiz.left, valor);
		        } else {
		            System.out.println("  O valor " + valor + " foi inserido a esquerda de " + raiz.valor);
		            raiz.left = new BinaryTree(valor);
		        }
		    } else if (valor > raiz.valor) {
		        if (raiz.right != null) {
		            inserir(raiz.right, valor);
		        } else {
		            System.out.println("  O valor " + valor + " foi inserido a direita de " + raiz.valor);
		            raiz.right = new BinaryTree(valor);
		        }
		    }
		  }
		}
	
	public static void buscar(BinaryTree raiz, int valor) {
		   if (raiz != null) {
		    if (valor < raiz.valor) {
		        if (raiz.left != null) {
		        	buscar(raiz.left, valor);
		        } else {
		            System.out.println("  O valor " + valor + " foi encontrado a esquerda de " + raiz.valor);
		            noEncontrado = raiz.left;
		        }
		    } else if (valor > raiz.valor) {
		        if (raiz.right != null && valor != raiz.right.valor) {
		        	buscar(raiz.right, valor);
		        } else {
		            System.out.println("  O valor " + valor + " foi encontrado a direita de " + raiz.valor);
		            noEncontrado = raiz.right;
		        }
		    }
		  }
		}

}
