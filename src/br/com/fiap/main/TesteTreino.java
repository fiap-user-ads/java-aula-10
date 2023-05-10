package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TesteTreino {
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		PessoaJuridica objPj = new PessoaJuridica(
				texto("Digite o nome"),
				texto("Digite o email"),
				inteiro("Digite a idade"),
				decimal("Digite a renda"),
				texto("Digite a razao social"),
				texto("Digite o cnpj")
		);
		Endereco objEnderecoPj = new Endereco(texto("Digite o endereco"));
		
		PessoaFisica objPf = new PessoaFisica(
				texto("Digite o nome"),
				texto("Digite o email"),
				inteiro("Digite a idade"),
				decimal("Digite a renda"),
				texto("Digite o rg"),
				texto("Digite o cpf")
		);
		Endereco objEnderecoPf = new Endereco(texto("Digite o endereco"));
		
		objPj.setEndereco(objEnderecoPj);
		objPf.setEndereco(objEnderecoPf);
		
		// SAÍDA 
		System.out.println("PESSOA JURIDICA");
		System.out.println("Email: " + objPj.getEmail());
		System.out.println("Email: " + objPj.getEndereco().getLogradouro());
		System.out.println();
		
		System.out.println("PESSOA FISICA");
		System.out.println("Email: " + objPf.getEmail());
		System.out.println("Email: " + objPf.getEndereco().getLogradouro());
	}
}
