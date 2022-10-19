package com.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		Matematica m = new Matematica();
		int maior = m.maior(40,30);
		System.out.println(maior);
	}

}
