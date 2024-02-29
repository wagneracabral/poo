package br.com.senai;

import javax.swing.JOptionPane;
public class Aula11funcoes {
	
	
	public static void main(String[] args) {		
		Run();
	}

		public static void Run() {
			dadosPessoais();
		}

		public static void dadosPessoais() {

			String nome;
			int titulo;
			int cpf;
			
			nome = JOptionPane.showInputDialog("Digite seu nome: ");
			titulo = Integer.parseInt(JOptionPane.showInputDialog("Digite seu titulo: "));
			cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite seu cpf: "));

			System.out.println(nome);
			System.out.println(titulo);
			System.out.println(cpf);
			
			public class Funcao() {
				public static void main(String[] args) {
					double n1 = 5;
					double n2 = 10;
					
					calcularMedia(n1,n2);
				}
				
				public static void calcularMedia(double n1, double n2) {
					double media = (n1 + n2) / 2;
					System.out.println(media);
					
						
					}
				}
			}

		}

	}


