package Uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	public void exibirMenuPrincipal() {
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("COFRINHO");
		System.out.println("1- Adicionar moeda");
		System.out.println("2- Remover moeda:");
		System.out.println("3- Listar moedas:");
		System.out.println("4- Calcular total convertido para real:");
		System.out.println("0- Encerrar:");
		String numeroSelecionado = sc.next();
		
		switch(numeroSelecionado) {
		
		case "0": //para encerrar o programa
			System.out.println("Programa encerrado!");
			break;
			
		case "1": //para Adicionar moeda
			exibirSubMenuAcionarMoedas();			
			exibirMenuPrincipal();
			break;
			
		case "2": //para Remover moeda
			exibirSubMenuRemoverMoedas();
			exibirMenuPrincipal();
			break;
			
		case "3": //para Listar moedas
			cofrinho.listagemMoedas();
			exibirMenuPrincipal();
			break;
			
		case "4": //para converter as moedas e Calcular total convertido para real
			double valorTotalConvertido =  cofrinho.totalCovnertido();
			System.out.println("O valor total convertido para real? " + valorTotalConvertido);
			exibirMenuPrincipal();
			break;
			
		default:
			System.out.println("Opção inválida!");
			exibirMenuPrincipal();
			break;
		}
	}
	
	private void exibirSubMenuAcionarMoedas() {
		System.out.println("Escolha uma moeda:");
		System.out.println("1- Real:");
		System.out.println("2- Dolar:");
		System.out.println("3- Euro:");
		int numeroMoeda = sc.nextInt();
		
		System.out.println("Digite o valor:");
		String valorTextoMoeda = sc.next();
		valorTextoMoeda = valorTextoMoeda.replace(",",".");
		double valorMoeda = Double.parseDouble(valorTextoMoeda);
		
		Moeda moeda = null;
		if (numeroMoeda == 1) {
			moeda = new Real(valorMoeda);
		}else if (numeroMoeda == 2) {
			moeda = new Dolar(valorMoeda);
		}else if (numeroMoeda == 3) {
			moeda = new Euro(valorMoeda);
		}else {
			System.out.println("Não existe essa moeda!");
			exibirMenuPrincipal();
		}
		cofrinho.adicionar(moeda);
	}
	
	private void exibirSubMenuRemoverMoedas() {
		System.out.println("Escolha uma moeda:");
		System.out.println("1- Real:");
		System.out.println("2- Dolar:");
		System.out.println("3- Euro:");
		int numeroMoeda = sc.nextInt();
		
		System.out.println("Digite o valor:");
		String valorTextoMoeda = sc.next();
		valorTextoMoeda = valorTextoMoeda.replace(",",".");
		double valorMoeda = Double.parseDouble(valorTextoMoeda);
		
		Moeda moeda = null;
		if (numeroMoeda == 1) {
			moeda = new Real(valorMoeda);
		}else if (numeroMoeda == 2) {
			moeda = new Dolar(valorMoeda);
		}else if (numeroMoeda == 3) {
			moeda = new Euro(valorMoeda);
		}else {
			System.out.println("Não existe essa moeda!");
			exibirMenuPrincipal();
		}
		cofrinho.remover(moeda);
	}

}
