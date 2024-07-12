package com.maximatech.desafio.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.maximatech.desafio.model.Cliente;
import com.maximatech.desafio.model.Endereco;
import com.maximatech.desafio.repository.ClienteRepository;
import com.maximatech.desafio.repository.EnderecoRepository;

import jakarta.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ClienteServiceTest {

	@Autowired
    private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	


	@Test
	public void testCadastroClienteSemNome() {
		    Endereco endereco = new Endereco();
		    endereco.setRua("Rua do Cliente");
		    endereco.setNumero("123");
		    endereco.setCidade("Cidade do Cliente");
		    endereco.setEstado("Estado do Cliente");
		    endereco.setCep("12345-678"); 
		    endereco.setLongitude(12.345678); 
		    endereco.setLatitude(18.345678); 

		   
		    enderecoRepository.save(endereco);	
	
	    Cliente cliente = new Cliente();
	    cliente.setCnpj("12345678901234"); 
	    cliente.setEndereco(new Endereco());

	    ClienteService clienteService = new ClienteService(clienteRepository);
	    assertThrows(IllegalArgumentException.class, () -> {
	        try {
	            clienteService.salvar(cliente);
	        } catch (ConstraintViolationException e) {
	            throw new IllegalArgumentException("O cliente não deve ser cadastrado sem nome", e);
	        }
	    });
	}
	
	
	@Test
	public void testCadastroClienteComCNPJInvalido() {
		Endereco endereco = new Endereco();
	    endereco.setRua("Rua do Cliente");
	    endereco.setNumero("123");
	    endereco.setCidade("Cidade do Cliente");
	    endereco.setEstado("Estado do Cliente");
	    endereco.setCep("12345-678"); 
	    endereco.setLongitude(12.345678); 
	    endereco.setLatitude(18.345678);

	    enderecoRepository.save(endereco);		
	    Cliente cliente = new Cliente();
	    cliente.setNome("Nome do Cliente");
	    cliente.setCnpj("123"); 
	    cliente.setEndereco(new Endereco()); 

	    ClienteService clienteService = new ClienteService(clienteRepository);
	    assertThrows(IllegalArgumentException.class, () -> {
	        try {
	            clienteService.salvar(cliente);
	        } catch (ConstraintViolationException e) {
	            throw new IllegalArgumentException("O CNPJ deve ser válido e ter 14 dígitos", e);
	        }
	    });
	}

	@Test
	public void testCadastroEnderecoSemLocalizacao() {
	    
	    Endereco endereco = new Endereco();
	    endereco.setRua("Rua do Cliente");
	    endereco.setNumero("123");
	    endereco.setCidade("Cidade do Cliente");
	    endereco.setEstado("Estado do Cliente");
	    endereco.setCep("12345-678"); 
	    assertNull(endereco.getLatitude(), "A latitude deve ser nula");
	    assertNull(endereco.getLongitude(), "A longitude deve ser nula");
	}
	


   
}
