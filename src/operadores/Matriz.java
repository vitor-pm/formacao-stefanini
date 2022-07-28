package operadores;

public class Matriz {

	public static void main(String[] args) {

		int[][] matriz = new int[2][2];
		matriz[0][0] = 1;
		matriz[0][1] = 2;

		matriz[1][0] = 3;
		matriz[1][1] = 4;


		
		for (int[] is : matriz) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
		
		String nomeString = matriz[0][0] == 2 ? "Vitor" : "Lucas";
		System.out.println(nomeString);
	}

}
