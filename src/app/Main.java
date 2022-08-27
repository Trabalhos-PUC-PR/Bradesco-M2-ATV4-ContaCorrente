package app;

import entities.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1000);
		cc.sacar(1100);
		cc.depositar(200);

	}

}
