package br.com.newton.agenda;

public class Contato {
	
	public String numero;
	public String nome;
	
	public void CriaContato (String numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public String MostrarNumero(String numero) {
		return numero;
	}
	
	public String MostrarNome(String nome) {
		return nome;
	}
	
}
