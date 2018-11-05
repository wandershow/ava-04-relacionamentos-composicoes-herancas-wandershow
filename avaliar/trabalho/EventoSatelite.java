package trabalho;
import trabalho.Evento.Tipo;

public class EventoSatelite {

	private Evento evento;
	private Tipo tipo;
	private String nome;
	private List inscritos = new List();
	
	public EventoSatelite(String nome, Tipo tipo,Evento evento ) {
		this.nome = nome;
		this.tipo = tipo;
		this.evento = evento;
		
		
	}
	

	public Tipo getTipo() {
		
		return tipo;
	}


	public String getNome() {
		return nome;
	}


	public Object getCidade() {
	
		return evento.getCidade();
	}

	public Evento getEventoCentral() {
		
		return evento;
	}
	
	public void inscrever(String nome) {
		this.inscritos.append(new Inscrito(nome, new Randomizer().nextString('A', 'Z', 16), this));
	}

	public Inscrito[] getInscritos() {
		Inscrito[] aux = new Inscrito[inscritos.count()];
		for (int i = 0; i < aux.length; i++) {
			aux[i] = (Inscrito) inscritos.get(i);
		}
		return aux;
	}

	public int getQuantidadeInscritos() {
		return inscritos.count();
}
	

}
