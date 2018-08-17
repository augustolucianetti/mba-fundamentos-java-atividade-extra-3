package br.com.fiap.exercicio3;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Exercicio3b {
	
	public static void main(String[] args) {
		
		Long startTime = System.currentTimeMillis();
		Stack<Integer> list = new Stack<>();
		for (int i = 0; i < 1000000; i++) {
			
			list.add(i);
		}
		
		list.get(499000);
		
		Long endTime = System.currentTimeMillis();
		Long timeExecution = endTime - startTime;
		System.out.println(timeExecution);
		
		startTime = System.currentTimeMillis();
		Set<Integer> hashList = new HashSet<>();
		
		for (int i = 0; i < 1000000; i++) {
			hashList.add(i);
		}
		Integer index = null;
		for(Integer element : hashList) {
			element.equals(499000);
			index = element;
		}
		endTime = System.currentTimeMillis();
		Long timeExecution2 = endTime - startTime;
		System.out.println(timeExecution2);
		
		if (timeExecution < timeExecution2) {
			System.out.println("Stack melhor");
		} else {
			System.out.println("HashSet melhor");
		}

	}
	
}
