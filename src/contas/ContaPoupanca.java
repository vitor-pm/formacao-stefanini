package contas;

import java.util.Date;

import exception.SaldoException;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String nome, int conta, double saldo, Date abertura, String gerente, Date aniversario) {
		super(nome, conta, saldo, abertura, gerente);
		this.aniversario = aniversario;
	}

	private Date aniversario;

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	void saqueConta(double valor) throws SaldoException {
		if ((super.getSaldo() - valor) < 0) {
			throw new SaldoException("Saldo insuficiente");
		} else {
			super.setSaldo(getSaldo() - valor);
		}
	}

	@Override
	public String toString() {
		return super.toString() + " ContaPoupanca [aniversario=" + aniversario + "]";
	}

}
