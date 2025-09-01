package br.com.washryan.dao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public String buscar(int id) {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void atualizar(int id, String contrato) {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void excluir(int id) {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }
}
