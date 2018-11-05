package heranca;

public class EventoSeminario extends EventoSatelite {

	public EventoSeminario(String nome, String cidade, Evento evento) {
		super(nome, cidade, evento);
	}

	@Override
	public String getTipo() {
		return "Seminario";
	}

}
