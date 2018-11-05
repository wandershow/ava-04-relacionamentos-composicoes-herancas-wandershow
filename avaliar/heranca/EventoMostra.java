package heranca;

public class EventoMostra extends EventoSatelite {
	
	public EventoMostra(String nome, String cidade, Evento evento) {
		super(nome, cidade, evento);
	}
	

	@Override
	public String getTipo() {
		return "Mostra";
}

}
