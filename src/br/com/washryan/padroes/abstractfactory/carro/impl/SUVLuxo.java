package br.com.washryan.padroes.abstractfactory.carro.impl;

import br.com.washryan.padroes.abstractfactory.carro.SUV;

public class SUVLuxo implements SUV {
    @Override
    public void exibirInfo() {
        System.out.println("SUV Luxo 2.0 Turbo • Câmbio Automático • 4x4 • Pacote tecnológico completo");
    }
}
