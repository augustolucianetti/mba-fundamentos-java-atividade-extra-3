package br.com.fiap.exercicio3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class Ecercicio3c {
	
public static void main(String[] args) {
		
		Long startTime = System.currentTimeMillis();
		Map<Integer, Integer> list = new HashMap<>();
		for (int i = 0; i < 1000000; i++) {
			
			list.put(i, i);
		}
		
		list.get(499000);
		
		Long endTime = System.currentTimeMillis();
		Long timeExecution = endTime - startTime;
		System.out.println(timeExecution);
		
		startTime = System.currentTimeMillis();
		Map<Integer, Integer> hashList = new WeakHashMap<>();
		
		for (int i = 0; i < 1000000; i++) {
			hashList.put(i, i);
		}
		
		hashList.get(499000);
		
		endTime = System.currentTimeMillis();
		Long timeExecution2 = endTime - startTime;
		System.out.println(timeExecution2);
		
		if (timeExecution < timeExecution2) {
			System.out.println("HashMap melhor");
		} else {
			System.out.println("WeakHashMap melhor");
		}

	}
}
