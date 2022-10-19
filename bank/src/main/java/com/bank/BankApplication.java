package com.bank;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = "Adriel";
		conta.saldo = 4000;
		conta.exibeSaldo();
		
		//conta.saque(1000);
		//conta.exibeSaldo();
		
		//conta.depositar(4500);
		//conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Marina";
		destino.saldo = 1700;
		destino.exibeSaldo();
	}

}
