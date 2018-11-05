package trabalho;

public class Evento {
	private String nome;
	private String cidade;
	private Tipo tipo;
	private List atividades = new List();
	private List eventoSatelite = new List();

	public enum Tipo {
		Semana, Escola, Salao, Seminario, Mostra;
	}

	public Evento(String nome, String cidade, Tipo tipo) {
		this.nome = nome;
		this.cidade = cidade;
		this.tipo = tipo;
	}

	public Object getNome() {

		return nome;
	}

	public Object getCidade() {

		return cidade;
	}

	public Tipo getTipo() {

		return tipo;
	}

	public Atividade novaAtividade(String descricao, String ministrante, int vagas, int horas, Atividade.Tipo tipo) {
		Atividade atividade = new Atividade(descricao, ministrante, vagas, horas, tipo, this);
		atividades.append(atividade);
		return atividade;
	}

	public Atividade novaAtividade(String descricao, int vagas, Atividade.Tipo tipo) {
		return novaAtividade(descricao, null, vagas, 0, tipo);
	}

	public Atividade novaAtividade(String descricao, int vagas, int horas, Atividade.Tipo tipo) {
		return novaAtividade(descricao, null, vagas, horas, tipo);
	}

	public Atividade novaAtividade(String descricao, String ministrante, Atividade.Tipo tipo) {
		return novaAtividade(descricao, ministrante, 0, 0, tipo);
	}

	

	public Atividade[] getAtividades() {
		Atividade[] tmp = new Atividade[this.atividades.count()];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = (Atividade) atividades.get(i);
		}
		return tmp;
	}

	public EventoSatelite novoEventoSatelite(String nome, Tipo seminario) {
		EventoSatelite evento = new EventoSatelite(nome, tipo, this);
		eventoSatelite.append(evento);
		return evento;
	}

	public EventoSatelite[] getEventosSatelites() {
		EventoSatelite[] evento = new EventoSatelite[eventoSatelite.count()];
		for (int i = 0; i < evento.length; i++) {
			evento[i] = (EventoSatelite) eventoSatelite.get(i);
		}
		return evento;
}
	
	}


