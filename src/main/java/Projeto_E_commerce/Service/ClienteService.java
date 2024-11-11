package Projeto_E_commerce.Service;

import Projeto_E_commerce.Service.dto.Clienteimple;
import Projeto_E_commerce.form.ClienteAtualizarForm;
import Projeto_E_commerce.form.ClienteForm;
import Projeto_E_commerce.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ClienteService {


    public ClienteForm CriarCliente();

    public ClienteAtualizarForm atualizarCliente(Long id, ClienteAtualizarForm form);

    public List<ClienteForm> ListaCliente();

    public Cliente buscarCliente(Long id);

    public void deletar(Long id);


}
