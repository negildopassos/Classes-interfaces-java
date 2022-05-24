package br.com.dio.banco;

public class Main {

	public static void main(String[] args) {
		
		
		Cliente nome = new Cliente();
		Cliente nome1 = new Cliente();
		nome.setNome("Negildo");
		nome1.setNome("Junior");
		Conta cc = new ContaCorrente(nome1);
		
		
		Conta cp = new ContaPoupanca(nome);
		
		cc.depositar(500);
		cc.transferir(200, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
