package br.com.washryan.padroes.abstractfactory.fabrica.impl;

import br.com.washryan.padroes.abstractfactory.carro.Sedan;
import br.com.washryan.padroes.abstractfactory.carro.SUV;
import br.com.washryan.padroes.abstractfactory.carro.impl.SUVPopular;
import br.com.washryan.padroes.abstractfactory.carro.impl.SedanPopular;
import br.com.washryan.padroes.abstractfactory.fabrica.FabricaCarro;

public class FabricaCarroPopular implements FabricaCarro {

    @Override
    public Sedan criarSedan() {
        return new SedanPopular();
    }

    @Override
    public SUV criarSUV() {
        return new SUVPopular();
    }
}
