package com.bank;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = "Adriel";
		conta.saldo = 4000;
		conta.exibeSaldo();
	
	}

}
