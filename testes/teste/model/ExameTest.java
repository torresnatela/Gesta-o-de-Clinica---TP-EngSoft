package teste.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestao.clinica.model.Exame;

class ExameTest {

    @Test
    public void testLiberarExameInexistente() {

        Exame exame = new Exame();

        exame.liberarExame();

    }

    @Test
    public void testLiberarExameExiste() {

        Exame exame = new Exame();

        // chamar metodo que registra exame

        exame.liberarExame();


    }
}
