package entities;

public class ContaCorrente {

	private double saldo;
	
	public ContaCorrente() {
		saldo = 0;
	}
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if(valor < 0) {
			System.out.println("O valor de saque deve ser positivo!");
			return;
		}
		if(valor > saldo) {
			System.out.println("ERRO: Saldo Insuficiente");
			return;
		}
		imprimirOperacao(-valor);
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		if(valor < 0) {
			System.out.println("O valor de depósito deve ser positivo!");
			return;
		}
		imprimirOperacao(+valor);
		saldo += valor;
	}
	
	private void imprimirOperacao(double valor) {
		
		char sign;
		double result = saldo + valor;
		if(valor < 0) {
			sign = '-';
			valor *= -1;
		}else {
			sign = '+';
		}
		System.out.printf("%.2f %c %.2f = %.2f\n", saldo, sign, valor, result);
	}
	
}
