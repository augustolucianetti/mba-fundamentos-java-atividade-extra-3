package br.com.fiap.exercicio3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercicio3a {
	
	public static void main(String[] args) {
		
		Long startTime = System.currentTimeMillis();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			
			list.add(i);
		}
		
		list.get(499000);
		
		Long endTime = System.currentTimeMillis();
		Long timeExecution = endTime - startTime;
		System.out.println(timeExecution);
		
		startTime = System.currentTimeMillis();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		for (int i = 0; i < 1000000; i++) {
			linkedList.add(i);
		}
		
		linkedList.get(499000);
		endTime = System.currentTimeMillis();
		Long timeExecution2 = endTime - startTime;
		System.out.println(timeExecution2);
		
		if (timeExecution < timeExecution2) {
			System.out.println("ArrayList melhor");
		} else {
			System.out.println("LinkedList melhor");
		}
		
	}
}
