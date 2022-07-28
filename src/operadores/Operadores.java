package operadores;

public class Operadores {

	public static void main(String[] args) {

		boolean a = true;
		boolean b = false;

		System.out.println(a & b);

		/**
		 * 
		 * AND
		 * 
		 * V and F => F
		 * V and V => V
		 * F and V => F
		 * F and F => F
		 * 
		 * OR
		 * 
		 * V or F => V
		 * V or V => V
		 * F or V => V
		 * F or F => F
		 * 
		 * XOR - Diferente
		 * 
		 * V xor F => V
		 * V xor V => F
		 * F xor V => V
		 * F xor F => F
		 * 
		 * Negação Lógica
		 * 
		 * !V => F
		 * !F => V
		 * 
		 * */

		int[] numeros = new int[10];
		int[] numeros2 = new int[] { 1, 2, 3 };
	}

}
