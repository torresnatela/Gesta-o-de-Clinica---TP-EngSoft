package teste.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestao.clinica.model.Paciente;

public class PacienteTest {

	@Test
	public void testAgendarConsulta() {

	Paciente paciente = new Paciente();
	
	paciente.agendarConsulta();

	}

}
