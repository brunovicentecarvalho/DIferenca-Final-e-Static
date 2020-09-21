package finale;

public class Fim {
	//Atributos final, pertencem as instancias da classe e n�o a classe. Os valores destes atributos podem ser declarados
		//apenas uma vez.
		public final int valor = 1;
		//Exemplo de erro ao tentar incrementar um atributo final:(Descomentar para visualizar)
//		public void erro(){
//			valor++;
//		}
		public int getValor() {
			return valor;
		}
		//Por�m estes atributos podem ser lidos sem alguma excess�o.
		public int somaValores(int valorChamado) {
			return valor + valorChamado;
		}
		//M�todos finais: 
		public final int somaValor(int valorParam) {
			return valor + valorParam;
		}
		//Tais m�todos n�o podem ser alterados em classes filhas. Exemplo de heran�a na outra classe;
}
