package model;

public class Declaracao implements Documento {
	
	private boolean assinatura;
	
	private TipoDocumento tipo;
	
	public Declaracao() {
		this.tipo = TipoDocumento.DECLARACAO;	
	}

	public boolean isAssinatura() {
		return assinatura;
	}

	public void setAssinatura(boolean assinatura) {
		this.assinatura = assinatura;
	}

	@Override
	public TipoDocumento getTipo() {
		return this.tipo;
	}
	
	

}
