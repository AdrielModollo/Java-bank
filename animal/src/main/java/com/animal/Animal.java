package com.animal;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Animal {

		double peso;
		String comida;
		
		void dormi(String animal) {
			System.out.println(animal + " Dormiu");
		}
		
		void fazerBarulho(String animal) {
			System.out.println(animal + " Fazer barulho");
		}
}
