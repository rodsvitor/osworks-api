package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController //Configura a classe como controlador REST
public class ClienteController {
	
	@GetMapping("/clientes") //O método GET chamará essa função
	public List<Cliente>listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João das alfaces");
		cliente1.setTelefone("2323141234");
		cliente1.setEmail("email_a");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("194098214098102");
		cliente2.setEmail("email_b");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
