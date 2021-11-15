package model;

import java.util.Date;

public class Nfe implements Documento {
	
	private String chaveNfe = "";
	
	private Date dataEmissao;
	
	private TipoDocumento tipo;
	
	public Nfe() {
		this.tipo = TipoDocumento.NFE;
	}
		
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

	@Override
	public TipoDocumento getTipo() {
		return tipo;
	}

	
	
	
	

}
