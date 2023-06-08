package teste.CRUD.Java.srpingBootNew.enums;

public enum UsuarioSetor {
    TECNOLOGIA("tecnologia"),
	RH("rh"),
	DIRETORIA("diretoria");

	private String value;

	private UsuarioSetor(String value) {
		this.value = value;
	}

	public String getSetor() {
		return value;
	}
	
	
}
