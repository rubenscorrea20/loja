package com.exemplo.testes;

import java.util.List;

import com.exemplo.entidade.Cliente;
import com.exemplo.respositorio.RepositorioCliente;

public class Teste {

	public static void main(String[] args) {
		
		RepositorioCliente repositorioCliente = new RepositorioCliente();
		Cliente cliente = new Cliente();
		
		
		//Salvar Cliente
		
		//cliente.setNome("Beltrano");
		//cliente.setIdade(26);
		//repositorioCliente.salvar(cliente);
		
		
		// Lista todos Clientes
//		List<Cliente> clientes = repositorioCliente.listarTodos();
//		for (Cliente cliente2 : clientes) {
//			System.out.println(cliente2.getNome());
//		}
		
	
		// Buscar por ID e atualizar
		cliente = repositorioCliente.obterPorId(2);
		cliente.setNome("Ciclano");
		
		repositorioCliente.salvar(cliente);
		
		System.out.println(cliente.getNome());
		
		
		
	}

}
