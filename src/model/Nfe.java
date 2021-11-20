package model;

import java.util.Date;

public class Nfe {
	
	private String chaveNfe = "";
	
	private Date dataEmissao;
	
	private String tipoDocumento = "Nfe";
		
	public Nfe() {	}
		
	public String getChaveNfe() {
		return chaveNfe;
	}

	public void setChaveNfe(String chaveNfe) {
		this.chaveNfe = chaveNfe;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	

}
