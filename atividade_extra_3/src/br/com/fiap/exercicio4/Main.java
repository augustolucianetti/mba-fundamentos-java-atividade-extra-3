package br.com.fiap.exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		List<Pessoa> list = new ArrayList<>();
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("João Garcia");
		pessoa1.setIdade((short)20);
		pessoa1.setSexo('M');
		pessoa1.setEmpresa("AIK Enterprises");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Maria Martins");
		pessoa2.setIdade((short) 44);
		pessoa2.setSexo('M');
		pessoa2.setEmpresa("Simples");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Henrique Fernando");
		pessoa3.setIdade((short) 43);
		pessoa3.setSexo('M');
		pessoa3.setEmpresa("AIK Enterprises");
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setNome("Inácio Luis");
		pessoa4.setIdade((short) 33);
		pessoa4.setSexo('M');
		pessoa4.setEmpresa("Magazine André");
		
		Pessoa pessoa5 = new Pessoa();
		pessoa5.setNome("Fernando Ferreira");
		pessoa5.setIdade((short) 87);
		pessoa5.setSexo('M');
		pessoa5.setEmpresa("Casas Recife");
		
		list.add(pessoa1);
		list.add(pessoa2);
		list.add(pessoa3);
		list.add(pessoa4);
		list.add(pessoa5);
		
		Random random = new Random();
		
		Pessoa pessoaRandom = list.get(random.nextInt(4));
		System.out.println("a)");
		System.out.println(pessoaRandom.toString());
		
		
		System.out.println("--------------------------------");
		System.out.println("b)");
		Collections.sort(list, (p1,p2) -> p1.getNome().compareTo(p2.getNome()));
		
		for(Pessoa pessoa : list) {
			System.out.println(pessoa);
		}
		
		System.out.println("--------------------------------");
		System.out.println("c)");
		Collections.sort(list, (p1,p2) -> p1.getNome().compareTo(p2.getNome()) * -1);
		
		for(Pessoa pessoa : list) {
			System.out.println(pessoa);
		}
	}
}
