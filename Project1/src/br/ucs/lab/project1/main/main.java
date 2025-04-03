/* Este arquivo contém, de modo geral, a lista de itens
 * ou chamadas de funções, com o mínimo de código */

package br.ucs.lab.project1.main;

public class main {
	public static void main (String[] args) {
     //ao iniciar o programa sistema exibe lista de
	//devedores, sem enrolação.
	
	//validar arquivos
	//le o arquivo .txt e cria lista de clientes no sistema
	//le o arquivo .txt e atribui valores para cada cliente
	//verifica valores pelo true/false
	// false = não pagou, true / pagou
	
	Help h = new Help();
	
	//Valida arquivo clientes + criar lista
	if (!h.validFile("clientes")) {
	    System.out.println("Erro na leitura do arquivo clientes");
	} else {
	    System.out.println(h.listaClientes());
	}
	
	
}	
}
