package br.com.senai;

import javax.swing.JOptionPane;

public class Aula09 {

	public static void main(String[] args) {
		int opcao = 0;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção -1)Cadastrar Aluno, \n2)Cadastrar Professor,9)Sair do programa"));
			if(opcao ==1) {
				System.out.println("Cadastrar Aluno");
			}
			if(opcao ==2) {
				System.out.println("Cadastrar Professor");
			}
		}while(opcao !=9);
		System.out.println("Programa finalizado.");

	}
}



