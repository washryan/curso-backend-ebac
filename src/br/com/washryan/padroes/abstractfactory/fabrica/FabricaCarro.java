package br.com.washryan.padroes.abstractfactory.fabrica;

import br.com.washryan.padroes.abstractfactory.carro.Sedan;
import br.com.washryan.padroes.abstractfactory.carro.SUV;

public interface FabricaCarro {
    Sedan criarSedan();
    SUV criarSUV();
}
