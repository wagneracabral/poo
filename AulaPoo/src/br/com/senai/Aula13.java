package br.com.senai;

import javax.swing.JOptionPane;

public class Aula13 {
			
	
			public static void main(String[] args) {
				
			int aluno = Integer.valueOf(JOptionPane.showInputDialog("Digite quantos alunos tem na sala"));
				
			
			for(int i = 0; i<aluno; i++) {
			
			double n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite a primeira nota"));
			double n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite a segunda nota"));
			double n3 = Integer.valueOf(JOptionPane.showInputDialog("Digite a terceira nota"));
			
			System.out.println(calcularMedia(n1,n2,n3));
			}
		}
		
		public static double calcularMedia(double n1, double n2, double n3) {
			return (n1 + n2 + n3) / 3;
		}
	}