package br.com.washryan.padroes.abstractfactory.carro.impl;

import br.com.washryan.padroes.abstractfactory.carro.Sedan;

public class SedanLuxo implements Sedan {
    @Override
    public void exibirInfo() {
        System.out.println("Sedan Luxo 2.0 Turbo • Câmbio Automático • Bancos em couro • ADAS");
    }
}
