package model;

public class Declaracao {
	
	private boolean assinatura;
	
	private String tipoDocumento = "Declaracao";
	
	public Declaracao(boolean assinatura) {
		this.assinatura = assinatura;
	}

	public boolean isAssinatura() {
		return assinatura;
	}

	public void setAssinatura(boolean assinatura) {
		this.assinatura = assinatura;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}
}
