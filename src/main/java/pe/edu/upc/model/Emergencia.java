package pe.edu.upc.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import pe.edu.upc.model.Paciente;

public class Emergencia implements Serializable{
private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEmergencia;
	
	@ManyToOne
	@JoinColumn(name = "idPaciente", nullable=false)
	private Paciente paciente;

	public int getIdEmergencia() {
		return idEmergencia;
	}

	public void setIdEmergencia(int idEmergencia) {
		this.idEmergencia = idEmergencia;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
}