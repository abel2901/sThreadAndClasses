package atividade1;

public class Produto {
	
	private double item;

	public Produto() {
		item = 5;
	}

	public double getSaldo() {
		return item;
	}

	public synchronized void estoque(double quantia) {
		System.out.print("estoque " + quantia);
		double novoEstoque = item + quantia;
		System.out.println(", novo estoque é " + novoEstoque);
		item = novoEstoque;
		notifyAll();
	}

	public synchronized void retira(double quantia) throws InterruptedException {
		while (item < quantia) {
			wait();
		}
		System.out.print("retirando " + quantia);
		double novoEstoq = item - quantia;
		System.out.println(", nova quantia " + novoEstoq);
		item = novoEstoq;
	}

}
