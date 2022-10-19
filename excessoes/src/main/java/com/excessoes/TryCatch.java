package com.excessoes;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TryCatch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continuar = true;
		
		do {
			try {
				System.out.println("Numero: ");
				int a = s.nextInt();
				System.out.println("Divisor: ");
				int b = s.nextInt();
				
				System.out.println(a / b);
				continuar = false;
			}
				catch(InputMismatchException el) {
					System.out.println("Favor inserir números inteiros!");
					s.nextLine(); //descarta entrada inválida
				}
				catch(Throwable e2) {
					System.out.println("O divisor deve ser diferente de zero!");
				}
				finally {
					System.out.println("Finally executado...");
				}
		} while (continuar);
	}

}
