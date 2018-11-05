package heranca;

import trabalho.Atividade;
import trabalho.Inscrito;

public class Chave {
	
	private Inscrito inscrito;
	private String chave;
	private Atividade atividade;
	private Randomizer randomizer = new Randomizer();
	private String key = "QWERTYUIOPLKJHGFDSAZXCVBNM";

	Chave(Inscrito inscrito, Atividade atividade) {
		this.inscrito = inscrito;
		this.atividade = atividade;
		geraChave();
	}

	public Chave(heranca.Inscrito inscrito2, heranca.Atividade atividade2) {
		
	}

	public Inscrito getInscrito() {
		return inscrito;
	}

	private void geraChave() {
		String s = "";
		for (int i = 0; i < 16; i++) {
			String aux = "" + key.charAt(randomizer.nextInt(25));
			while(i > 0 && s.charAt(i-1) == aux.charAt(0)) {
				aux = "" + key.charAt(randomizer.nextInt(25));
			}
			s += aux;
		}
		if (this.existeChave(s)) {
			geraChave();
		}else {
			chave = s;
		}
	}

	private boolean existeChave(String s) {
		Inscrito[] inscritos = atividade.getInscritos();
		for (int i = 0; i < inscritos.length; i++) {
			if (inscritos[i].getChave().toString().equals(s)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return chave;
	}
	
	
	
	


}
