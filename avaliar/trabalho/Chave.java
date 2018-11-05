package trabalho;

public class Chave {

	private Inscrito inscrito;
	private String chave;
	private Atividade atividade;

	public Chave(String chave, Atividade atividade, Inscrito inscrito) {
		this.chave = chave;
		this.inscrito = inscrito;
		this.atividade = atividade;
		
	}


	public Inscrito getInscrito() {
		return inscrito;
	}

	public String getChave() {
		return chave;
	}
	
	public Atividade getAtividade() {
		return atividade;
	}

	@Override
	public String toString() {
		return chave;
	}
	
	

}
	
	

