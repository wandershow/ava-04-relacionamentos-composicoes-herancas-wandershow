package heranca;

public class MiniCurso extends Atividade{
	
	private int cargaHoraria;
	private List inscritos = new List();
	private int vagas;

	MiniCurso(String nome, int vagas, int cargaHoraria, Evento evento) {
		super(nome, evento);
		this.vagas = vagas;
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	@Override
	public int getHoras(){
		return this.cargaHoraria;
	}
	
	public int getVagas() {
		return this.vagas;
	}
	
	@Override
	public int getQuantidadeInscritos() {
		return this.inscritos.count();
	}

	@Override
	public int getVagasRemanescentes() {
		return this.vagas-this.inscritos.count();
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
	public String getTipo() {
		return "MiniCurso";
	}

	@Override
	public Inscrito inscrever(String nome) {
		if (this.getVagasRemanescentes() == 0) {
			throw new NaoHaVagaException("Não há mais vagas!");
		}
Inscrito inscrito = new Inscrito(nome, this);
		this.inscritos.append(inscrito);
		return inscrito;
	}
	


}
