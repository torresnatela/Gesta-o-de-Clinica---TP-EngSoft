package teste.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestao.clinica.model.Pessoa;

class PessoaTest {

    @Test
    public void testAlterarDadosPessoaNaoExiste() {

        Pessoa pessoa = new Pessoa();

        pessoa.alteraDados();

    }

    @Test
    public void testAlterarDadosPessoaExiste() {

        Pessoa pessoa = new Pessoa();

        pessoa.alteraDados();

    }

    @Test
    public void testAlterarDadosinvalido() {

        Pessoa pessoa = new Pessoa();

        pessoa.alteraDados();

    }

    @Test
    public void testAlterarDadosValido() {

        Pessoa pessoa = new Pessoa();

        pessoa.alteraDados();

    }
}
