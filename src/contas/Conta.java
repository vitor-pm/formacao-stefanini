package contas;

import java.util.Date;

import exception.SaldoException;

public abstract class Conta {

	private String nome;
	private int conta;
	private double saldo;
	private Date abertura;
	private String gerente;
	
	
	
	public Conta(String nome, int conta, double saldo, Date abertura, String gerente) {
		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;
		this.abertura = abertura;
		this.gerente = gerente;
	}

	void deposito(double valor) {
		this.saldo += valor;
	}
	
	void saqueConta(double valor) throws SaldoException {
		this.saldo -= valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Date getAbertura() {
		return abertura;
	}
	public void setAbertura(Date abertura) {
		this.abertura = abertura;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", conta=" + conta + ", saldo=" + saldo + ", abertura=" + abertura + ", gerente="
				+ gerente + "]";
	}
	

}
