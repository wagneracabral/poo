package br.com.senai;

import javax.swing.JOptionPane;

public class Exe2 {

	public static void main(String[] args) {
		int numero = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero"));
		System.out.println(verificaNumero(numero));
	}
	
		public static String verificaNumero(int numero) {
			if (numero >= 0) {
				return "positivo";
			}
			else {
				return "negativo";
			}
		}
	}


