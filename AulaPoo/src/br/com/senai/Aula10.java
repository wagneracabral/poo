package br.com.senai;

import javax.swing.JOptionPane;

public class Aula10 {

	public static void main(String[] args) {

		int opcaomesario = 0;
		int opcao = 0;
		int totalangela = 0;
		int totalgean = 0;
		int totalcesar = 0;
		int totalnulo = 0;
		int totalbranco =0;

		public static void Run() {
			dadosPessoais();
		}



		do {
			opcaomesario = Integer.parseInt(JOptionPane.showInputDialog(" Opcoes Mesario:\n 1)Iniciar Votação \n 2) Encerrar"));
			if(opcaomesario ==1) {
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha um candidato: \n-1)Angela Pepino\n*Partido: PMDB \n 2)Gean da Silva \n *Partido: PT \n 3)Cesar Souza Neto \n *Partido: DEM \n 4)Nome: Voto Nulo \n 5)Voto em Branco"));
				if(opcao ==1) {
					System.out.println("Nome: Angela Pepino \n *Partido: PMDB");
					totalangela++;
				}
				if(opcao ==2) {
					System.out.println("Gean da Silva \\n *Partido: PT ");
					totalgean++;
				}
				if(opcao ==3) {
					System.out.println("Cesar Souza Neto \\n *Partido: DEM");
					totalcesar++;
				}
				if(opcao ==4) {
					System.out.println("Nome: Voto Nulo");
					totalnulo++;
				}
				if(opcao ==5) {
					System.out.println("Nome: Voto em Branco");
					totalbranco++;

				}

			} 
		}while (opcaomesario != 2);

		System.out.println("\nVotacao Encerrada.");
		System.out.println("\nContagem dos Votos:");
		System.out.println("Angela Pepino - PMDB: " + totalangela);
		System.out.println("Gean da Silva - PT: " + totalgean);
		System.out.println("Cesar Souza Neto - DEM: " + totalcesar);
		System.out.println("Nulo: " + totalnulo);
		System.out.println("Branco: " + totalbranco);

	}
}