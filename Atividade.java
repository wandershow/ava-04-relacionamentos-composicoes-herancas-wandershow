package heranca;

public abstract class Atividade {
	
	private Evento evento;
	private String nome;

	Atividade(String nome, Evento evento){
		this.nome = nome;
		this.evento = evento;
	}

	public Evento getEvento() {
		return evento;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return this.nome;
	}
	
	public abstract int getHoras();
	
	public abstract int getQuantidadeInscritos();

	public abstract String getTipo();

	public abstract Inscrito inscrever(String nome);

	public abstract Inscrito[] getInscritos();
	
	public abstract int getVagasRemanescentes();

	public abstract int getVagas();
	
	
	
}


