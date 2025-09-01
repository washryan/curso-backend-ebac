package br.com.washryan.service;

import br.com.washryan.dao.ClienteDao;
import br.com.washryan.dao.ClienteDaoMock;
import br.com.washryan.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}