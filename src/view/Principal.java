package view;

import java.util.Scanner;

import controller.SomaMultiplicacao;

public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o valor de A:");
		
		int A = s.nextInt();
		System.out.println("Informe o valor de B:");

		int B = s.nextInt();
		
		SomaMultiplicacao sm = new SomaMultiplicacao();
		
		int res = sm.FuncMulti(A,B);
		
		System.out.println("Resultado: "+res);

	}

}
