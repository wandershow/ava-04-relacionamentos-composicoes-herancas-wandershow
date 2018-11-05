package heranca;



	public class Palestra extends Atividade {

		private String ministrante;
		private List inscritos = new List();

		public Palestra(String nome, String ministrante, Evento evento) {
			super(nome, evento);
			this.ministrante = ministrante;
		}

		public String getMinistrante() {
			return ministrante;
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
			return 0;
		}

		@Override
		public int getVagas() {
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
		public String getTipo() {
			// TODO Auto-generated method stub
			return "Palestra";
		}

	}


