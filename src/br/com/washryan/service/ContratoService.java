package br.com.washryan.service;

import br.com.washryan.dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar(int id) {
        return contratoDao.buscar(id);
    }

    @Override
    public String atualizar(int id, String contrato) {
        contratoDao.atualizar(id, contrato);
        return "Atualizado";
    }

    @Override
    public String excluir(int id) {
        contratoDao.excluir(id);
        return "Excluído";
    }
}
