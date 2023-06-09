package Uninter;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}
	
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Não existe nenhuma moeda no cofre!");
			return;
		}
		for(Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
		
				
		}

	public double totalCovnertido() {
		if(this.listaMoedas.isEmpty()) {
			return 0;
	}
		double ValorAcumulado = 0;
		
		for(Moeda moeda : this.listaMoedas) {
			ValorAcumulado = ValorAcumulado + moeda.converter();
		}
		return ValorAcumulado;
	}
	 

}
