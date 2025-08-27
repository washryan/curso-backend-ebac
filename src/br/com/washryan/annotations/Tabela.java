package br.com.washryan.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Documented
@Retention(RetentionPolicy.RUNTIME)      // disponível em tempo de execução (Reflection)
@Target(ElementType.TYPE)                // pode ser usada em classes, interfaces, enums
public @interface Tabela {
    String value(); // único membro -> nome da tabela
}
