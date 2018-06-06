package br.com.teste;

public class BinaryTree {

	int valor;
	BinaryTree left;
	BinaryTree right;
	
	public int soma() {
		System.out.println(valor);
		if(null!= right) {
			valor += right.soma();
		}
		if(null != left) {
			valor += left.soma();
		}
		return valor;
    }
	
	public BinaryTree(int valor) {
		super();
		this.valor = valor;
	}
	
	public BinaryTree() {
		super();
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public BinaryTree getLeft() {
		return left;
	}
	public void setLeft(BinaryTree left) {
		this.left = left;
	}
	
	public BinaryTree getRight() {
		return right;
	}
	public void setRight(BinaryTree right) {
		this.right = right;
	}
	
}
