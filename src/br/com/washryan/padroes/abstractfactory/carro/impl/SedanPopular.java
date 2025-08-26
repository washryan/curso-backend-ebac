package br.com.washryan.padroes.abstractfactory.carro.impl;

import br.com.washryan.padroes.abstractfactory.carro.Sedan;

public class SedanPopular implements Sedan {
    @Override
    public void exibirInfo() {
        System.out.println("Sedan Popular 1.0 • Câmbio Manual • Ar-condicionado");
    }
}
