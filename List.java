package trabalho;
import java.util.Arrays;

public class List {
	

		private Object[] objetos;
		private int tamanho = 2;

		public List() {

			this.objetos = new Object[tamanho];
		}
		
		public Object[] getObjects() {

			return this.objetos;

	}

		public int count() {
			int count = 0;
			for (Object o : this.objetos) {
				if (o != null)
					count++;
			}

			return count;

		}

		public boolean isEmpty() {

			return this.count() == 0;

		}

		public Object get(int i) {
			if (this.objetos[i] == null)
				return null;

			return this.objetos[i];
		}

		public void append(Object o) {
			if (this.count() == this.objetos.length - 1) {
				Object[] temp = Arrays.copyOf(this.objetos, this.objetos.length * 2);
				this.objetos = temp;
				temp = null;

			}
			for (int i = 0; (i < objetos.length); i++) {
				if ((this.objetos[i] == null) && (o != null)) {
					this.objetos[i] = o;
					return;
				}

			}

		}

		public int indexOf(Object o) {
			boolean achou = false;
			int i = 0;
			while ((i < objetos.length) && (!achou)) {
				achou = (objetos[i] == o);
				if (!achou) {
					i = i + 1;
				}
			}
			if (achou) {
				return i;
			}

			return -1;

		}

		public boolean delete(int o) {
			if ((this.objetos[o] == null) || (o > objetos.length))
				return false;
			for (int i = o; i < this.objetos.length - 1; i++) {
				this.objetos[i] = objetos[++o];
				this.objetos[o] = null;
			}
			return true;
		}

		public boolean has(Object o) {
			for (Object e : this.objetos)
				if (o.equals(e))
					return true;
			return false;
		}

		public boolean remove(Object o) {
			int c = 0;
			for (int i = 0; i < this.objetos.length - 1; i++) {
				if (this.objetos[i].equals(o)) {
					c = i;
					objetos[i] = objetos[++c];
					objetos[c] = null;
					return true;

				}

			}

			return false;
		}

		public void reset() {
			for (int i = 0; i < objetos.length; i++) {
				this.objetos[i] = null;
			}
		}

		public void insert(Object o, int i) {
			if (i < 0 ) return;
			if ((this.objetos[i] == null) && (i < this.objetos.length) && (i >= 0) && (o != null) && (i < count() - 1)) {
				this.objetos[i] = o;
			}
			else if(i <= count()) {
				int c = count();
				for (int j = count() + 1; j > i; j--) {
					this.objetos[j] = this.objetos[c--];
				}
				this.objetos[i] = o;
			}
			
		}

		public void prepend(Object o) {
			insert(o, 0);

		}

	}


