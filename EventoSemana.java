package heranca;

public class EventoSemana extends Evento{
	
	EventoSemana(String nome, String cidade) {
		super(nome, cidade);
	}
	
	@Override
	public String getTipo() {
		return "Semana";
}

}
