package contas;

import java.util.Date;

public class ContaCorrente extends Conta {

	private double limite;

	private double taxaMensal;

	public ContaCorrente(String nome, int conta, double saldo, Date abertura, String gerente, double limite,
			double taxaMensal) {
		super(nome, conta, saldo, abertura, gerente);
		this.limite = limite;
		this.taxaMensal = taxaMensal;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxaMensal() {
		return taxaMensal;
	}

	public void setTaxaMensal(double taxaMensal) {
		this.taxaMensal = taxaMensal;
	}

	@Override
	public String toString() {
		return super.toString() + "ContaCorrente [limite=" + limite + ", taxaMensal=" + taxaMensal + "]";
	}

}
