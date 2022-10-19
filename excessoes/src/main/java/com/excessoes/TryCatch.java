package com.excessoes;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TryCatch {

	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Numero: ");
			int a = s.nextInt();
			System.out.println("Divisor: ");
			int b = s.nextInt();
			
			System.out.println(a / b);
		}
			catch(InputMismatchException el) {
				System.out.println("Error de InputMismatchException capturado!");
			}
			catch(Throwable e2) {
				System.out.println("Erro de ArithmaticException capturado!");
			}
	}

}
