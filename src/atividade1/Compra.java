package atividade1;

public class Compra extends Thread {
	private Produto produto;
	private double quantia;
	private static final int REPETICOES = 10;
	private static final int ESPERA = 10;

	public Compra(Produto conta, double quantia) {
		this.produto = conta;
		this.quantia = quantia;
	}

	public void run() {
		try {
			for (int i = 1; i <= REPETICOES && !isInterrupted(); i++) {
				produto.estoque(quantia);
				sleep(ESPERA);
			}
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
