package br.com.washryan.service;

public interface IContratoService {
    String salvar();

    String buscar(int id);
    String atualizar(int id, String contrato);
    String excluir(int id);
}
