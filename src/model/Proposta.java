package model;

import java.util.Date;

public class Proposta {
	
	private String nome;
	
	private Date dataExpiracao;
	
	private String tipoDocumento = "Proposta";
	
	public Proposta(Date dataExpiracao) {
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

	public String getTipoDocumento() {
		return tipoDocumento;
	}
	
}
