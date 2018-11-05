package heranca;

public abstract class Evento {
	
	private String cidade;
	private String nome;
	private List atividades = new List();
	private List eventosSatelites = new List();

	Evento(String nome, String cidade){
		this.nome = nome;
		this.cidade = cidade;
	}
	
	public abstract String getTipo();
	
	public Atividade[] getAtividades() {
		Atividade[] atividade = new Atividade[atividades.count()];
		for (int i = 0; i < atividade.length; i++) {
			atividade[i] = (Atividade) atividades.get(i);
		}
		return atividade;
	}

	public String getCidade() {
		return cidade;
	}

	public String getNome() {
		return nome;
	}

	public Atividade novoSeminario(String nome, int vagas) {
		Atividade atividade = new Seminario(nome, vagas, this);
		this.atividades.append(atividade);
		return atividade;
	}

	public Atividade novoMinicurso(String nome, int vagas, int cargaHoraria) {
		Atividade atividade = new MiniCurso(nome, vagas, cargaHoraria, this);
		this.atividades.append(atividade);
		return atividade;
	}

	public Atividade novaAtividade(String nome, String ministrante, int vagas, int cargaHoraria) {
		Atividade atividade = new Oficina(nome, ministrante, vagas, cargaHoraria, this);
		this.atividades.append(atividade);
		return atividade;
	}

	public Atividade novaAtividade(String nome, String ministrante) {
		Atividade atividade = new Palestra(nome, ministrante, this);
		this.atividades.append(atividade);
		return atividade;
	}

	public EventoSatelite novoEventoSeminario(String nome) {
		EventoSatelite evento = new EventoSeminario(nome, this.cidade, this);
		this.eventosSatelites .append(evento);
		return evento;
	}

	public EventoSatelite novoEventoMostra(String string) {
		EventoSatelite evento = new EventoMostra(nome, this.cidade, this);
		this.eventosSatelites .append(evento);
		return evento;
	}

	public EventoSatelite[] getEventosSatelites() {
		EventoSatelite[] evento = new EventoSatelite[this.eventosSatelites.count()];
		for (int i = 0; i < evento.length; i++) {
			evento[i] = (EventoSatelite) this.eventosSatelites.get(i);
		}
		return evento;
	}
	
	


}
