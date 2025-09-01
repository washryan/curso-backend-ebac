package br.com.washryan.streams.test;

import br.com.washryan.streams.Pessoa;
import br.com.washryan.streams.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class PessoaTest {

    @Test
    void deveConterSomenteMulheresNaLista() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "F"));
        pessoas.add(new Pessoa("Maria", "F"));
        pessoas.add(new Pessoa("João", "M"));
        pessoas.add(new Pessoa("Carla", "F"));
        pessoas.add(new Pessoa("Pedro", "M"));

        List<Pessoa> mulheres = App.obterMulheres(pessoas);

        // Verifica se todos da lista são "F"
        assertTrue(mulheres.stream().allMatch(p -> "F".equalsIgnoreCase(p.getSexo())),
                "A lista contém algum elemento que não é mulher!");
    }
}
