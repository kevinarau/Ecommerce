package Projeto_E_commerce.Service;

import Projeto_E_commerce.dto.ClienteDto;
import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {


    @Autowired
    private ClienteRepository clienteRepository;


    public Cliente CriarCliente(ClienteDto clienteDto) {
        Cliente cl = new Cliente();
        cl.setName(clienteDto.getName());
        cl.setCpf(clienteDto.getCpf());
        cl.setContato(clienteDto.getContato());
        cl.setEmail(clienteDto.getEmail());

        return clienteRepository.save(cl);


    }


    public void atualizarCliente(Long id, ClienteDto form) {
        Optional<Cliente> cli = clienteRepository.findById(id);
        if (cli.isPresent()) {
            Cliente cl = cli.get();
            cl.setContato(form.getContato());
            cl.setEmail(form.getEmail());
            clienteRepository.save(cl);
        }

    }


    public List<ClienteDto> ListaCliente() {
        List<Cliente> forms = clienteRepository.findAll();
        return forms.stream().map(x -> new ClienteDto(x)).toList();


    }


    public Cliente buscarCliente(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();

    }


}
