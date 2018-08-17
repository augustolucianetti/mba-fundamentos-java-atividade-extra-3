package br.com.fiap.exercicio5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		 String path = System.getProperty("user.dir");

		StringBuilder mensagem = new StringBuilder();
		mensagem.append(JOptionPane.showInputDialog("Digite sua mensagem"));
		System.out.println(mensagem);

		StringBuilder mensagemCriptografada = new StringBuilder();
		for(int i = 0; i < mensagem.length(); i ++) {
			mensagemCriptografada.append((int)mensagem.charAt(i) + " ");
		}
		System.out.println(mensagemCriptografada);
		try {
			FileWriter arquivoCriptografado = new FileWriter(path + File.separator + "ArquivoCriptografado.txt");
			arquivoCriptografado.write(mensagemCriptografada.toString());
			arquivoCriptografado.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		StringBuilder mensagemDescriptografada = new StringBuilder();
		String [] array = mensagemCriptografada.toString().split(" ");
		for(int i = 0; i < array.length; i ++) {
			int caracterCorrente = Integer.parseInt(array[i]);
			mensagemDescriptografada.append((char) caracterCorrente );
		}
		System.out.println(mensagemDescriptografada);
		try {
			FileWriter arquivoDescriptografado = new FileWriter(path + File.separator + "ArquivoDesriptografado.txt");
			arquivoDescriptografado.write(mensagemDescriptografada.toString());
			arquivoDescriptografado.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
