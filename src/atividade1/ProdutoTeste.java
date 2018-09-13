package atividade1;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto produto = new Produto();
		Compra t0 = new Compra(produto, 10);
		Venda t1 = new Venda(produto, 10);
		t0.start();
		t1.start();
	}
}
