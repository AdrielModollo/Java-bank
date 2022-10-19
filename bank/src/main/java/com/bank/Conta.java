package com.bank;

public class Conta {
	String cliente;
	double saldo;
	
	void exibeSaldo() {
		System.out.println(cliente + " seu saldo é: " + saldo);
	}

	void saque(double valor) {
		saldo -= valor;
	}
	
	void depositar(double valor) {
		saldo += valor;
	}
}
