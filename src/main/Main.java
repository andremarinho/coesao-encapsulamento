package main;

import model.Declaracao;
import util.ValidadorDocumento;

public class Main {

	public static void main(String[] args) {
		Declaracao declaracao = new Declaracao();
		
		if(ValidadorDocumento.validadeDeclaracao(declaracao)) {
			System.out.println("Declação é valida!");
		} else {
			System.out.println("Declaração NÃO é valida");
		}

	}

}
