package main;

import model.Declaracao;
import util.ValidadorDocumento;

public class Main {

	public static void main(String[] args) {
		
		Declaracao declaracao = new Declaracao(true);
		
		ValidadorDocumento.validarDeclaracao(declaracao);

	}

}
