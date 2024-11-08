package Projeto_E_commerce.Service;

import Projeto_E_commerce.form.ClienteAtualizarForm;
import Projeto_E_commerce.form.ClienteForm;
import Projeto_E_commerce.model.Cliente;

import java.util.List;

public interface ClienteService {


    public ClienteForm CriarCliente();

    public ClienteAtualizarForm atualizarCliente(Long id, ClienteAtualizarForm form);

    public List<Cliente> ListaCliente();

    public Cliente buscarCliente(Long id);

    public void deletar(Long id);


}
