package gestao.clinica.aplicacao;

import java.util.ArrayList;

import gestao.clinica.model.Consulta;
import gestao.clinica.model.Exame;
import gestao.clinica.model.Medico;
import gestao.clinica.model.Paciente;
import gestao.clinica.model.Pessoa;

public class main {

	public static void main(String[] args) {
		
		//Listas de Medicos, pacientes e consultas para programar.
		ArrayList<Consulta> listaConsultas = new ArrayList<>();
		ArrayList<Medico> listaMedicos = new ArrayList<>();
		ArrayList<Paciente> listaPacientes = new ArrayList<>();
		ArrayList<Exame> listaExames = new ArrayList<>();
		
		
		
		//Criando um paciente
		Paciente pacienteTeste = new Paciente("Gabriel", "14067737602", "31993410214", "Diabetico, cardiopata, idiota", 0);
		Paciente pacienteTeste2 = new Paciente("Luis", "14667737602", "31993410214", "Diabetico, cardiopata, idiota", 1);
		Pessoa pessoa1 = new Pessoa();
		
		
		
		//criando um médico
		Medico medicoTeste = new Medico("Marcell", "12345678", "31999557385", "crmteste", "Cardiologista", 0);
		
		//Adicionando usuario na lista de usuarios
		listaMedicos.add(medicoTeste);
		listaPacientes.add(pacienteTeste);
		listaPacientes.add(pacienteTeste2);
		
		//Agendamento da consulta.
		listaPacientes.get(0).agendarConsulta(0, "27/03", listaConsultas, listaMedicos);
		listaPacientes.get(1).agendarConsulta(0, "31/12", listaConsultas, listaMedicos);
		
		//Criando e Adicionando exame.
		listaMedicos.get(0).arquivarExame("Hemograma", 0, listaExames);
		listaMedicos.get(0).arquivarExame("Exame de Urina", 1, listaExames);
		
		//Liberação do resultado do exame.
		listaExames.get(0).LiberarExame("98mg");
		
		System.out.print("\n\n\n");
		System.out.print("----------Teste de visualizar Exames-----------\n");
		//Visualização dos dados do exame.
		listaExames.get(0).visualizarExame(); //98mg
		listaExames.get(1).visualizarExame(); 
	
		System.out.print("\n\n\n");
		System.out.print("---------Teste de visualizar consultas agendadas------------\n");
		//Visualizar todas as consultas de um médico.
		listaMedicos.get(0).visualizarConsultas();
		
	}
	
}
