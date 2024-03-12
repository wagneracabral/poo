package br.com.senai;

import javax.swing.JOptionPane;

public class Trabalho1 {
	static Estoque e1 = new Estoque();
	static Estoque e2 = new Estoque();
	static Estoque e3 = new Estoque();

	

	public static void main(String[] args) {
		chamarMenu();
	}

	private static void chamarMenu() {
		int opcao = 0;
		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog("1 cadastrar, 2 remover, 3 consultar, 4 atualizar, 5 listar, 6 sair"));
			if (opcao == 1) {
				cadastrar();
			} else if (opcao == 2) { 
				remover();
			} else if (opcao == 3) { 
				consultar();
			} else if (opcao == 4) { 
				atualizar();
			} else if (opcao == 5) { 
				listar();
			}
			else {
				System.out.println("Digite uma opcao valida");
			}
		} while (opcao != 6);

		System.out.println("bye!!!");
	}

	public static void cadastrar() {
		if (e1.getCodprod() == 0) {
			e1.setCodprod(Integer.valueOf(JOptionPane.showInputDialog("Digite o cod do produto 1")));
			e1.setNomeprod(JOptionPane.showInputDialog("Digite o nome do produto 1"));
			e1.setNomeprod(JOptionPane.showInputDialog("Digite a desc do produto 1"));
		} else if(e2.getCodprod() == 0) {
			e2.setCodprod(Integer.valueOf(JOptionPane.showInputDialog("Digite o cod do produto 2")));
			e2.setNomeprod(JOptionPane.showInputDialog("Digite o nome do produto 2"));
			e2.setNomeprod(JOptionPane.showInputDialog("Digite a desc do produto 2"));
		} else if (e3.getCodprod() == 0) {
			e3.setCodprod(Integer.valueOf(JOptionPane.showInputDialog("Digite o cod do produto 3")));
			e3.setNomeprod(JOptionPane.showInputDialog("Digite o nome do produto 3"));
			e3.setNomeprod(JOptionPane.showInputDialog("Digite a desc do produto 3"));
		} else {
			System.out.println("Estoque todo ocupado");
		}
	}

	public static void remover() {
		int codToRemove = Integer.valueOf(JOptionPane.showInputDialog("Digite o cod que deseja remover"));
		if (e1.getCodprod() == 1) {
			e1.setCodprod(0);
			e1.setNomeprod( "");
			e1.setDescprod("");
		} else if (codToRemove == 2) {
			e2.setCodprod( 0);
			e2.setNomeprod("");
			e2.setDescprod("");
		}else if (codToRemove == 3) {
			e3.setCodprod( 0);
			e3.setNomeprod("");
			e3.setDescprod("");
		} else {
			System.out.println("cod nao existente");
		}
	}

	public static void consultar() {
		int codToConsultar = Integer.valueOf(JOptionPane.showInputDialog("Digite o cod que deseja consultar"));
		if (codToConsultar == 1) {
			System.out.println(e1.getCodprod());
			System.out.println(e1.getNomeprod());
			System.out.println(e1.getDescprod());
		} else if (codToConsultar == 2) {
			System.out.println(e2.getCodprod());
			System.out.println(e2.getNomeprod());
			System.out.println(e2.getDescprod());
		}else if (codToConsultar == 3) {
			System.out.println(e3.getCodprod());
			System.out.println(e3.getNomeprod());
			System.out.println(e3.getDescprod());
		} else {
			System.out.println("cod nao existente");
		}
	}

	public static void atualizar() {
		int codToUp = Integer.valueOf(JOptionPane.showInputDialog("Digite o cod que deseja atualizar"));
		
		if (codToUp == 1) {
			e1.setCodprod(Integer.valueOf(JOptionPane.showInputDialog("Digite o cod do produto 1")));
			e1.setNomeprod( JOptionPane.showInputDialog("Digite o nome do produto 1"));
			e1.setDescprod(JOptionPane.showInputDialog("Digite a desc do produto 1"));
		} else if (codToUp == 2) {
			e2.setCodprod( Integer.valueOf(JOptionPane.showInputDialog("Digite o cod do produto 2")));
			e2.setNomeprod(JOptionPane.showInputDialog("Digite o nome do produto 2"));
			e2.setDescprod(JOptionPane.showInputDialog("Digite a desc do produto 2"));
		} else if (codToUp == 3) {
			e3.setCodprod(Integer.valueOf(JOptionPane.showInputDialog("Digite o cod do produto 3")));
			e3.setNomeprod(JOptionPane.showInputDialog("Digite o nome do produto 3"));
			e3.setDescprod(JOptionPane.showInputDialog("Digite a desc do produto 3"));
		} else {
			System.out.println("Estoque todo ocupado");
		}
	}

	public static void listar() {
		System.out.println(e1.getCodprod());
		System.out.println(e1.getNomeprod());
		System.out.println(e1.getDescprod());
		
		System.out.println(e2.getCodprod());
		System.out.println(e2.getNomeprod());
		System.out.println(e2.getDescprod());
		System.out.println(e3.getCodprod());
		System.out.println(e3.getNomeprod());
		System.out.println(e3.getDescprod());

	}
}