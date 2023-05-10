package br.com.fiap.beans;

public class PessoaFisica extends Pessoa{
	private String rg;
	private String cpf;
	
	// CONSTRUCTOR
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}
	public PessoaFisica(String nome, String email, int idade, double renda, String rg, String cpf) {
		super(nome, email, idade, renda);
		this.rg = rg;
		this.cpf = cpf;
	}
	
	// GET & SET
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String indentificador() {
		return "Pj";
	}
}
