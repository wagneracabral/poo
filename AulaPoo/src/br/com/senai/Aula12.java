package br.com.senai;

public class Aula12 {


	public static void main(String[] args) {
		calcularMedia("Rafael",8, 10);
		calcularMedia("João",3, 3);
		calcularMedia("Renato",3, 5);
		calcularMedia("Jhony",6,3);
		calcularMedia("Isadora",4, 12);
	}

	public static void calcularMedia(String name, double n1, double n2) {
		double media = calcularMediaDeDoisNumero(n1 + n2) / 2);
		System.out.println(media);
		
		if (media >=6) {
			System.out.println("O aluno " + name + " foi aprovado com média " + media);
			else {
				System.out.println("O aluno " + name + "foi reprovado com média " + media);
			}
		}
	}	
}