package br.com.washryan.padroes.abstractfactory.carro.impl;

import br.com.washryan.padroes.abstractfactory.carro.SUV;

public class SUVPopular implements SUV {
    @Override
    public void exibirInfo() {
        System.out.println("SUV Popular 1.6 • Câmbio Manual • Multimídia básica");
    }
}
