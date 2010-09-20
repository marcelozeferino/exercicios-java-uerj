package br.com.uerj.model;


import java.util.Date;
import java.util.List;

import br.com.uerj.infraestrutura.dao.TurmaDAO;

public class Turma {
	
	private int codigo;
	private Date dataInicio;
	private int cargaHoraria;
	
	public Turma(int codigo, Date dataInicio, int cargaHoraria){
		
		this.codigo = codigo;
		this.dataInicio = dataInicio;
		this.cargaHoraria = cargaHoraria; 
		
	}
	
	public Turma(){
		//this.dataInicio = new Date();
	}
	
	//Getters and setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	/**
	 * Método responsável por colaborar com objetos de dados (DAO ou Repositorios)
	 * e recuperar turmas cadastradas
	 * 
	 * @return List<Turma>
	 */
	public List<Turma> getTurmas(){
		
		return new TurmaDAO().obterTurmasCadastradas();
		
	}
	
	/**
	 * Método responsável por colaborar com objetos de dados
	 * e persistir o objeto atual
	 */
	public void persistir(){
		new TurmaDAO().persistirTurma(this);
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		
		return "Código: " + getCodigo() + " Data Início: " + getDataInicio() + " Carga Horária: " + getCargaHoraria();
		
	}
	
	

}
