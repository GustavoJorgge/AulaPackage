package br.com.newton.main;

import java.util.Scanner;
import br.com.newton.agenda.Contato;

public class Telefone {
	public static void main(String []args) {
		
		Contato contato = new Contato();
		String numero;
		String nome;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Entre com o numero de telefone: ");
		numero = ler.nextLine();
		System.out.printf("Entre com o nome do contato:");
		nome = ler.nextLine();
		
		if(numero.length()==9) {
			contato.CriaContato(numero,nome);
			System.out.printf("Telefone cadastrado!\n");
		}else {
			System.out.printf("Telefone inválido!\n");
		}
		
		System.out.printf("Nome: %s\n",contato.MostrarNome(nome));
		System.out.printf("Numero: %s\n", contato.MostrarNumero(numero));
		
	}
}
