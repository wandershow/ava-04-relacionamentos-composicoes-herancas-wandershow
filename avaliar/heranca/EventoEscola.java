package heranca;

public class EventoEscola extends Evento {
	
	public EventoEscola(String nome, String cidade) {
		super(nome, cidade);
	}

	@Override
	public String getTipo() {
		return "Escola";
	}


}
