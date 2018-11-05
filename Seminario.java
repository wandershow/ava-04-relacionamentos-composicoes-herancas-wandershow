package heranca;


	
	public class Seminario extends Atividade {

		private List inscritos = new List();
		private int vagas;

		Seminario(String nome, int vagas, Evento evento) {
			super(nome, evento);
			this.vagas = vagas;
		}

		public int getVagas() {
			return this.vagas;
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
		public int getVagasRemanescentes() {
			return this.vagas - this.inscritos.count();
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
			return "Seminario";
		}

	}


