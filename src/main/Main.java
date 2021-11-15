package main;

import java.util.Date;

import model.Declaracao;
import model.Nfe;
import model.Proposta;
import util.ValidadorDocumento;

public class Main {

	public static void main(String[] args) {
		Nfe nfe = new Nfe();
		Proposta proposta = new Proposta(new Date());
		Declaracao declaracao = new Declaracao();
		
		ValidadorDocumento.validar(nfe);

	}

}
