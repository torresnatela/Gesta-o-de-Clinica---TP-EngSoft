package teste.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestao.clinica.model.Medico;


public class MedicoTest {

	@Test
	public void testArquivarExame() {

	    Medico medico = new Medico();

	    medico.arquivarExame();

	}

	@Test
	public void testVisualizarConsultas() {

	    Medico medico = new Medico();

	    medico.visualizarConsultas();

	}
}
