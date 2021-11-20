package util;

import java.util.Date;

import model.Declaracao;
import model.Nfe;
import model.Proposta;

public class ValidadorDocumento {
	
	public static void validarDeclaracao(Declaracao declaracao) {
		if(declaracao.isAssinatura()) {
			System.out.println(declaracao.getTipoDocumento()+" Valida");
		} else {
			System.out.println(declaracao.getTipoDocumento()+" NÃO Valida");
		}
	}
	
	public static void validarNfe(Nfe nfe) {
		if(!nfe.getChaveNfe().isEmpty()) {
			System.out.println(nfe.getTipoDocumento()+" Valida");
		}else { 
			System.out.println(nfe.getTipoDocumento()+" NÃO Valida");
		}
	}
	
	public static void validarProposta(Proposta proposta) {
		if(proposta.getDataExpiracao().after(new Date())) {
			System.out.println(proposta.getTipoDocumento()+" Valida");
		}else {
			System.out.println(proposta.getTipoDocumento()+" NÃO Valida");
		}
	}
	
	
}
