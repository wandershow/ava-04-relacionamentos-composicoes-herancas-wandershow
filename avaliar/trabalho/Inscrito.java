package trabalho;

public class Inscrito {

	private String nome;
	private Atividade atividade;
	private Chave chave;
	private boolean concluido;
	private EventoSatelite eventoSatelite;

	public Inscrito(String nome, String chave, Atividade atividade) {
		this.nome = nome;
		this.atividade = atividade;
		this.chave = new Chave(chave, atividade, this);
		this.concluido = false;
	}

	public Inscrito(String nome, String chave, EventoSatelite evento) {
		this.nome = nome;
		this.eventoSatelite = evento;
		this.chave = new Chave(chave, atividade, this);
		this.concluido = false;
	}

	public boolean isConcluido() {
		return this.concluido;
	}

	public EventoSatelite getEventoSatelite() {
		return eventoSatelite;
	}

	public String getNome() {
		return nome;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public Chave getChave() {
		return chave;
	}

	@Override
	public String toString() {
		return nome;
	}

	public void confirmarPresenca() {
		this.concluido = true;
	}

}
