package estatico;

public class estatico {
	//Um atributo static � definido como pertecente a forma da classe, n�o � inst�ncia dela, logo, seu valor � igual para todas as classes
	//instanciadas deste tipo. Exemplo :
	private static int valor = 0;
	public static int getValor() {
		return valor;
	}
	//Um atributo est�tico pode ser incrementado ou alterado. Exemplos:
	public void setValor(int novoValor) {
		valor = novoValor;
	}
	public void acrescentaUm() {
		valor++;
	}
	
	// Metodos Est�ticos : (Explicarei a facilidade dele na classe principal)
	public static int somaValores(int valorASomar) {
		return valor + valorASomar;
	}
	//Por�m metodos est�ticos n�o conseguem chamar atributos "normais" da classe. Exemplo :
	public int exemplo1 = 1;
	//Descomentar o met�do abaixo para visualizar o erro;
//	public static int somaExemplo() {
//		return exemplo1 + valor;
//	}
	
}
