package gestao.clinica.model;

import java.util.ArrayList;

public class Medico extends Pessoa{
	
	protected String crm;
	protected String especializacao;
	
	
	
	//Getters e Setters
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	// Construtor da classe Medico
	public Medico(String nome, String cpf, String contato, String crm, String especializacao, int id) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.contato = contato;
		this.crm = crm;
		this.especializacao = especializacao;		
		this.setId(id);
		
	}

	
	
	public void alteraDados(String crm, String especializacao) {
		
		this.crm = crm;
		this.especializacao = especializacao;
	}
	
	public void arquivarExame(String nomeExame, int id_paciente ,ArrayList<Exame> listaExames) {
		
		Exame exame = new Exame(nomeExame, id_paciente);
		listaExames.add(exame);
		
	}
	
	public void visualizarConsultas() {
		
		
		for(int i = 0; i < this.consultasAgendadas.size(); i++) {
			
			System.out.print("Consulta: " + i + "\n");
			System.out.print("Data da Consulta: " + this.consultasAgendadas.get(i).data + "\n");
			System.out.print("ID do Paciente: " + this.consultasAgendadas.get(i).id_paciente + "\n");

		}
			
	}


}
