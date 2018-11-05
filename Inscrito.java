package heranca;

public class Inscrito {
	
	private String nome;
	private Atividade atividade;
	private Chave chave;
	private boolean concluido = false;

	public Inscrito(String nome, Atividade atividade) {
		this.nome = nome;
		this.atividade = atividade;
		this.chave = new Chave(this, atividade);

	}

	public boolean isConcluido() {
		return this.concluido;
	}

	public String getNome() {
		return nome;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	@Override
	public String toString() {
		return nome;
	}

	public void confirmarPresenca() {
		this.concluido = true;
	}

	public Chave getChave() {
		return this.chave;
	}

}
