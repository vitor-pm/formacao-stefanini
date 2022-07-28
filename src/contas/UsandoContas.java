package contas;

import java.util.Date;

import exception.SaldoException;

public class UsandoContas {

	public static void main(String[] args) throws SaldoException {
		
		ContaCorrente conta = new ContaCorrente("Vitor", 1, 100, new Date(2022, 7, 27), "Gerente", 1000, 10);
		
		conta.deposito(500);
		conta.saqueConta(40);
		
		System.out.println(conta.toString());
		
		ContaPoupanca contaPoupanca = new ContaPoupanca("Vitor", 1, 100, new Date(2022, 7, 27), "Gerente", new Date(2022, 7, 27));
		
		System.out.println(contaPoupanca.toString());
		
		try {
			contaPoupanca.saqueConta(1000);
		} catch (SaldoException e) {
			System.err.println(e.getMessage());
		}

	}

}
