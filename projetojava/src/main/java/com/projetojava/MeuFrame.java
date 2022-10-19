package com.projetojava;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuFrame extends JFrame {
	
	public MeuFrame() {
		
		super("Meu frame");
		
		JButton botao = new JButton("Clique");
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Permite ao usuário fechar o frame assim que clicar no botão “X”
		setSize(300, 300); //Define o tamanho do frame (300 pixels de largura e 300 pixels de altura).
		setVisible(true); //Define o frame como visível (pode estar oculto).
	}

	public static void main(String[] args) {
		new MeuFrame();
	}
}
