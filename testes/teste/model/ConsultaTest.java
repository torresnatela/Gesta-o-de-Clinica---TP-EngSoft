package teste.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestao.clinica.model.Consulta;

class ConsultaTest {

    @Test
    public void testSetDataInvalida() {

        Consulta consulta = new Consulta();

        consulta.setData();

    }

    @Test
    public void testSetDataValida() {

        Consulta consulta = new Consulta();

        consulta.setData();

    }

    @Test
    public void testSetPaciente() {

        Consulta consulta = new Consulta();

        consulta.setPaciente();

    }

    @Test
    public void testSetMedico() {

        Consulta consulta = new Consulta();

        // chamar metodo que adicionar medico antes

        consulta.setMedico();

    }

}
