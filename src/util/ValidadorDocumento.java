package util;

import java.util.Date;

import model.Declaracao;
import model.Nfe;
import model.Proposta;

public class ValidadorDocumento {

	public static boolean validarNfe(Nfe nfe) {
		if(!nfe.getChaveNfe().isEmpty()) {
			return true;
		}else { 
			return false;
		}
	}
	
	public static boolean validaProposta(Proposta proposta) {
		if(proposta.getDataExpiracao().after(new Date())) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean validadeDeclaracao(Declaracao declaracao) {
		if(declaracao.isAssinatura()) {
			return true;
		} else {
			return false;
		}
	}
}
