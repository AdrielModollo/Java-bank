package com.projetojava;

import javax.swing.JFrame;

public class MeuFrame {
	
	public MeuFrame() {
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Permite ao usuário fechar o frame assim que clicar no botão “X”
		frame.setSize(300, 300); //Define o tamanho do frame (300 pixels de largura e 300 pixels de altura).
		frame.setVisible(true); //Define o frame como visível (pode estar oculto).
	}

	public static void main(String[] args) {
		new MeuFrame();
	}
}
