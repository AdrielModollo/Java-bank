package com.animal;

public class AnimalTeste {
	
	public static void main(String[] args) {
		
		Cachorro luna = new Cachorro();
		luna.comida = "ração";
		luna.dormi("Cachorro");
		
		Galinha pintadinha = new Galinha();
		pintadinha.dormi("Galinha");
	}
}
