/*Este arquivo contem diversos métodos, simples e dividos
 * para executar seus devidos afazeres, e ser chamado no
 * main   */

package br.ucs.lab.project1.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Help {

	public boolean validFile(String file) {
		File myFile = new File(String.format("files\\%s.txt", file));
		
		if (myFile.exists()) {
	        return true;
	    } else {
	        System.out.println("Arquivo não encontrado: " + myFile.getAbsolutePath());
	        return false;
	    }
	}

	public List<String> listaClientes() {
		List<String> list = new ArrayList<String>();
		File myFile = new File("files/clientes.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				String[] dados = linha.split(";");

				if (dados.length >= 2) {
					String id = dados[0];
					String nome = dados[dados.length - 1];
					list.add("ID: " + id + ", Nome: " + nome);
				}
			}
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao ler o arquivo cartaz");
			e.printStackTrace();
		}
		return list;
	}

}
