package heranca;

public class EventoSatelite extends Atividade {

	
	private String nome;
	private String cidade;
	private List inscritos = new List();

	EventoSatelite(String nome, String cidade, Evento evento) {
		super(nome, evento);
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public Evento getEventoCentral() {
		return super.getEvento();
	}
	
	@Override
	public int getHoras() {
		return 0;
	}
	
	@Override
	public int getQuantidadeInscritos() {
		return this.inscritos.count();
	}
	
	@Override
	public int getVagas() {
		return 0;
	}
	
	@Override
	public int getVagasRemanescentes() {
		return 0;
	}
	
	@Override
	public Inscrito[] getInscritos() {
		Inscrito[] inscrito = new Inscrito[this.inscritos.count()];
		for (int i = 0; i < inscrito.length; i++) {
			inscrito[i] = (Inscrito) this.inscritos.get(i);
		}
		return inscrito;
	}

	@Override
	public Inscrito inscrever(String nome) {
		Inscrito inscrito = new Inscrito(nome, this);
		this.inscritos.append(inscrito);
		return inscrito;
	}

	@Override
	public String toString() {
		return nome;
	}

}
