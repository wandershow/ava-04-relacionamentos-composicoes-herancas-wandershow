package heranca;

public class EventoSalao extends Evento{
	
	public EventoSalao(String nome, String cidade) {
		super(nome, cidade);
	}

	@Override
	public String getTipo() {
		return "Salao";
}

}
