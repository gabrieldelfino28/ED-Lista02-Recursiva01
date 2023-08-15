package controller;

public class SomaMultiplicacao {

	public SomaMultiplicacao() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public int FuncMulti(int A, int B) {
		
		if(B == 1) { //Condição de parada -> Quando B for igual a 1, retorna o próprio A como uma última soma da pilha
			return A;
		}
		
		return A + FuncMulti(A,B-1);
		/*
		 * Primeiramente, a função recebe o valor de A e B, informado pelo usuário, onde A é multiplicado B.
		 * Assim, de forma recursiva a função começa somando A com a chamada da própria função, a cada chamada
		 * A é somado com A e B é reduzido por 1, até chegar a 1, na sua condição de parada.
		 * No fim da pilha, é retornado o valor final da multiplicação para o usuário.
		 */
	}

}
