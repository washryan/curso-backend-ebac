package br.com.washryan.dao;

public interface IContratoDao {
    void salvar();

    // novos métodos
    String buscar(int id);
    void atualizar(int id, String contrato);
    void excluir(int id);
}
