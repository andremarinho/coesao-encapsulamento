package main;

import model.Declaracao;
import util.ValidadorDocumento;

public class Main {

	public static void main(String[] args) {
		Declaracao declaracao = new Declaracao();
		
		if(ValidadorDocumento.validadeDeclaracao(declaracao)) {
			System.out.println("Decla��o � valida!");
		} else {
			System.out.println("Declara��o N�O � valida");
		}

	}

}
