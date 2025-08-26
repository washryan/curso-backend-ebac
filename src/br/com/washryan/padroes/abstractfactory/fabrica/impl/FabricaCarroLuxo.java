package br.com.washryan.padroes.abstractfactory.fabrica.impl;

import br.com.washryan.padroes.abstractfactory.carro.Sedan;
import br.com.washryan.padroes.abstractfactory.carro.SUV;
import br.com.washryan.padroes.abstractfactory.carro.impl.SUVLuxo;
import br.com.washryan.padroes.abstractfactory.carro.impl.SedanLuxo;
import br.com.washryan.padroes.abstractfactory.fabrica.FabricaCarro;

public class FabricaCarroLuxo implements FabricaCarro {

    @Override
    public Sedan criarSedan() {
        return new SedanLuxo();
    }

    @Override
    public SUV criarSUV() {
        return new SUVLuxo();
    }
}
