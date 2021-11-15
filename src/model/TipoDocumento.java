package model;

public enum TipoDocumento {
	
	NFE("Ativo"),
    PROPOSTA("Pendente"),
    DECLARACAO("Pendente de Aprovação");

    public String descricao;

    TipoDocumento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    

}
