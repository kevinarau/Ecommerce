package Projeto_E_commerce.Service.dto;


import Projeto_E_commerce.Service.ClienteService;
import Projeto_E_commerce.form.ClienteAtualizarForm;
import Projeto_E_commerce.form.ClienteForm;
import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Clienteimple implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public ClienteForm CriarCliente() {
        return null;
    }

    @Override
    public ClienteAtualizarForm atualizarCliente(Long id, ClienteAtualizarForm form) {
        return null;
    }

    @Override
    public List<ClienteForm> ListaCliente() {
        List<Cliente> forms = clienteRepository.findAll();
          List<ClienteForm> forms1 = forms.stream().map(x -> new ClienteForm()).toList();
          return forms1;

    }

    @Override
    public Cliente buscarCliente(Long id) {
        return null;
    }

    @Override
    public void deletar(Long id) {

    }
}