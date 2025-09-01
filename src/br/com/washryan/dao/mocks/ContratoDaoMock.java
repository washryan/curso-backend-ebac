package br.com.washryan.dao.mocks;

import br.com.washryan.dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoDaoMock implements IContratoDao {

    @Override
    public void salvar() {
        System.out.println("Contrato salvo no mock!");
    }

    @Override
    public String buscar(int id) {
        return "Contrato " + id;
    }

    @Override
    public void atualizar(int id, String contrato) {
        System.out.println("Contrato atualizado no mock: " + contrato);
    }

    @Override
    public void excluir(int id) {
        System.out.println("Contrato excluído no mock: " + id);
    }
}
