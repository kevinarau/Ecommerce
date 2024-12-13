package Projeto_E_commerce.Service;

import Projeto_E_commerce.dto.ClienteDto;
import Projeto_E_commerce.dto.ProdutosDto;
import Projeto_E_commerce.dto.ProdutosListaDto;
import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.model.Produtos;
import Projeto_E_commerce.model.ProdutosList;
import Projeto_E_commerce.projection.ProjetoProdutos;
import Projeto_E_commerce.repository.ClienteRepository;
import Projeto_E_commerce.repository.ProdutosListRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.Attribute;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {


    @Autowired
    private ClienteRepository clienteRepository;


    @Autowired
    private ProdutosListRepository produtosListRepository;


    public Cliente CriarCliente(Long id, ClienteDto clienteDto) {
        if (clienteRepository.findById(id).isPresent()) {
            throw new IllegalStateException("Cliente com o ID já existe.");
        }
        Cliente cliente = new Cliente();
        cliente.setIdCliente(id);
        cliente.setName(clienteDto.getName());
        cliente.setCpf(clienteDto.getCpf());
        cliente.setContato(clienteDto.getContato());
        cliente.setEmail(clienteDto.getEmail());

        return clienteRepository.save(cliente);
    }


    public void atualizarCliente(Long id, ClienteDto form) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado com o ID: " + id));

        if (form.getContato() != null) cliente.setContato(form.getContato());
        if (form.getEmail() != null) cliente.setEmail(form.getEmail());
        if (form.getName() != null) cliente.setName(form.getName());


        clienteRepository.save(cliente);
    }



    public List<ClienteDto> ListaCliente() {
        List<Cliente> forms = clienteRepository.findAll();
        return forms.stream().map(x -> new ClienteDto(x)).toList();


    }

    public Cliente buscarCliente(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado com o ID: " + id));
    }


    @Transactional(readOnly = true)
    public List<ProdutosDto> clientproducts(Long idprod) {
        List<ProjetoProdutos> produtos = (List<ProjetoProdutos>) clienteRepository.productSelected(idprod);
        if (produtos == null || produtos.isEmpty()) {
            return List.of();
        }
        return produtos.stream().map(ProdutosDto::new).toList();
    }


}
