package com.maximatech.desafio.service;

import com.maximatech.desafio.exception.ResourceNotFoundException;
import com.maximatech.desafio.model.Cliente;
import com.maximatech.desafio.model.Endereco;
import com.maximatech.desafio.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado com o ID: " + id));
    }

    public Cliente salvar(@Validated Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void excluir(Long id) {
        if (!clienteRepository.existsById(id)) {
            throw new ResourceNotFoundException("Cliente não encontrado com o ID: " + id);
        }
        clienteRepository.deleteById(id);
    }
    
    public Cliente atualizarCliente(Long id, Cliente clienteAtualizado) {
        Cliente clienteExistente = clienteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado com o ID: " + id));

        clienteExistente.setNome(clienteAtualizado.getNome());
        clienteExistente.setCnpj(clienteAtualizado.getCnpj());
        clienteExistente.setCodigo(clienteAtualizado.getCodigo());
    
        Endereco enderecoAtualizado = clienteAtualizado.getEndereco();
        if (enderecoAtualizado != null) {
            Endereco enderecoExistente = clienteExistente.getEndereco();
            enderecoExistente.setRua(enderecoAtualizado.getRua());
            enderecoExistente.setNumero(enderecoAtualizado.getNumero());
            enderecoExistente.setCep(enderecoAtualizado.getCep());
            enderecoExistente.setCidade(enderecoAtualizado.getCidade());
            enderecoExistente.setEstado(enderecoAtualizado.getEstado());
            enderecoExistente.setLatitude(enderecoAtualizado.getLatitude());
            enderecoExistente.setLongitude(enderecoAtualizado.getLongitude());
        }      
        return clienteRepository.save(clienteExistente);
    }
}
