package br.com.fiap.exercicio4;

public class Pessoa {
	
	private String nome;
	private short idade;
	private char sexo;
	private String empresa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public short getIdade() {
		return idade;
	}
	public void setIdade(short idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " Idade: " + getIdade() + " Sexo: " + getSexo() + " Empresa: " + getEmpresa();   
	}
}
