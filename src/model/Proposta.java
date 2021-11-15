package model;

import java.util.Date;

public class Proposta implements Documento {
	
	private String nome;
	
	private Date dataExpiracao;
	
	private TipoDocumento tipo;
	
	public Proposta(Date dataExpiracao) {
		this.tipo = TipoDocumento.PROPOSTA;
		this.dataExpiracao = dataExpiracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	@Override
	public TipoDocumento getTipo() {
		return tipo;
	}
	
	

}
