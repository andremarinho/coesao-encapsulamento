package util;

import java.util.Date;

import model.Declaracao;
import model.Documento;
import model.Nfe;
import model.Proposta;
import model.TipoDocumento;

public class ValidadorDocumento {

	public static void validar(Documento documento) {
		
		if(TipoDocumento.NFE.equals(documento.getTipo())) {
			Nfe nfe = (Nfe) documento;
			if(!nfe.getChaveNfe().isEmpty()) {
				System.out.println("NFe Valida");
			}else { 
				System.out.println("NFe NÃO Valida");
			}
		}
		
		if(TipoDocumento.PROPOSTA.equals(documento.getTipo())) {
			Proposta proposta = (Proposta) documento;
			if(proposta.getDataExpiracao().after(new Date())) {
				System.out.println("Proposta Valida");
			}else {
				System.out.println("Proposta NÃO Valida");
			}
		}
		
		if(TipoDocumento.DECLARACAO.equals(documento.getTipo())) {
			Declaracao declaracao = (Declaracao) documento;
			if(declaracao.isAssinatura()) {
				System.out.println("Declaracao Valida");
			} else {
				System.out.println("Declaração NÃO Valida");
			}
		}
				
	}	
	
}
