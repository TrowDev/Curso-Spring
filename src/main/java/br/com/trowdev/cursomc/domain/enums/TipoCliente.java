package br.com.trowdev.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int codigo;
	private String descricao;
	
	private TipoCliente(int cod, String desc) {
		codigo = cod;
		descricao = desc;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) return null;
		for(TipoCliente tc : TipoCliente.values()) {
			if(tc.getCodigo()==cod) {
				return tc;
			}
		}
		throw new IllegalArgumentException("ID "+cod+" inválido!");
	}
	
}
