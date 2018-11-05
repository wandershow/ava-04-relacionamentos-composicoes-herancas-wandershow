package trabalho;

public class Atividade {

	public enum Tipo {
		Seminario, Curso, Oficina, Palestra, Minicurso;
	}

	private String descricao;
	private Tipo tipo;
	private int vagas;
	private int horas;
	private Evento evento;
	private String ministrante;
	private String nome;
	private List inscritos = new List();

	public Atividade(String descricao, String ministrante, int vagas, int horas, Tipo tipo, Evento evento) {
		this.descricao = descricao;
		this.tipo = tipo;
		this.vagas = vagas;
		this.horas = horas;
		this.evento = evento;
		this.ministrante = ministrante;
	}

	public Atividade(String descricao, int vagas, Tipo seminario) {
		this.descricao = descricao;
		this.vagas = vagas;
		this.tipo = seminario;

	}

	public Atividade(String descricao, int vagas, int cargaHoraria, Tipo minicurso) {

		this.descricao = descricao;
		this.vagas = vagas;
		this.horas = cargaHoraria;
		this.tipo = minicurso;

	}

	public Atividade(String descricao, String ministrante, int vagas, int cargaHoraria, Tipo oficina) {
		this.descricao = descricao;
		this.ministrante = ministrante;
		this.vagas = vagas;
		this.horas = cargaHoraria;
		this.tipo = oficina;

	}

	public Atividade(String nome, String ministrante, Tipo palestra) {
		this.nome = nome;
		this.ministrante = ministrante;
		this.tipo = palestra;
	}

	public String getMinistrante() {
		return ministrante;
	}

	public String getNome() {
		return nome;
	}

	public Object getDescricao() {

		return descricao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public int getVagas() {
		return vagas;
	}

	public int getHoras() {
		return horas;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public int getVagasRemanescentes() {
		return this.vagas - inscritos.count();
	}

	public Inscrito inscrever(String nome) {
		if (this.vagas - inscritos.count() == 0 && this.vagas != 0) {
			throw new NaoHaVagaException("Não há mais vagas!");
		}
		Inscrito i = new Inscrito(nome, new Randomizer().nextString('A', 'Z', 16), this);
		inscritos.append(i);
		return i;
	}

	public Inscrito[] getInscritos() {
		Inscrito[] tmp = new Inscrito[inscritos.count()];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = (Inscrito) inscritos.get(i);
		}
		return tmp;
	}

	public String createChave() {
		String s = "";
		for (int i = 0; i < 16; i++) {
			char a = (char) new Randomizer().nextInt(65, 90);
			s += a;
		}
		for (Object o : inscritos.getObjects()) {
			Inscrito tmp = (Inscrito) o;
			if (tmp.getChave().toString().equals(s)) {
				s = createChave();
			}
		}
		return s;
	}
	public int getQuantidadeInscritos() {
		return inscritos.count();
	}
	
	@Override
	public String toString() {
		return "Atividade [nome=" + descricao + ", cargaHoraria=" + horas + ", tipo=" + tipo + ", vagas=" + vagas
				+ ", evento=" + evento + "]";
}

}
