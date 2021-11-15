package model;

public enum TipoDocumento {
	
	NFE("Ativo"),
    PROPOSTA("Pendente"),
    DECLARACAO("Pendente de Aprova��o");

    public String descricao;

    TipoDocumento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    

}
