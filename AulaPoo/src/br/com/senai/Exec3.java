package br.com.senai;

import javax.swing.JOptionPane;

public class Exec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o primeiro valor"));
		double n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o segundo valor "));
		double n3 = Integer.valueOf(JOptionPane.showInputDialog("Digite a terceiro valor "));

		verificarMaior(n1,n2,n3);
		
	}

	
	public static void verificarMaior (double n1, double n2, double n3) {
		if (n1 > n2 && n1> n3 ) {
			System.out.println("Valor 1 é o maior");
		}
		else if (n2 > n1 && n2> n3 ) {
			System.out.println("Valor 2 é o maior");
		}
		else {
			System.out.println("Valor 3 é o maior");
		}
	}
	
	
	
}
