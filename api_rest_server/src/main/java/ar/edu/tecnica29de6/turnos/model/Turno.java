package ar.edu.tecnica29de6.turnos.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "turnos")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroTurno;

    @Column(nullable = false)
    private LocalDateTime creacion;

    @Column(nullable = false)
    private LocalDateTime fechaHoraTurno;

    public Long getNumeroTurno() {
		return numeroTurno;
	}

	public void setNumeroTurno(Long numeroTurno) {
		this.numeroTurno = numeroTurno;
	}

	public LocalDateTime getCreacion() {
		return creacion;
	}

	public void setCreacion(LocalDateTime creacion) {
		this.creacion = creacion;
	}

	public LocalDateTime getFechaHoraTurno() {
		return fechaHoraTurno;
	}

	public void setFechaHoraTurno(LocalDateTime fechaHoraTurno) {
		this.fechaHoraTurno = fechaHoraTurno;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getPuestoAtencionAsignado() {
		return puestoAtencionAsignado;
	}

	public void setPuestoAtencionAsignado(int puestoAtencionAsignado) {
		this.puestoAtencionAsignado = puestoAtencionAsignado;
	}

	public int getPendiente() {
		return pendiente;
	}

	public void setPendiente(int pendiente) {
		this.pendiente = pendiente;
	}

	public int getLlamado() {
		return llamado;
	}

	public void setLlamado(int llamado) {
		this.llamado = llamado;
	}

	@Column(nullable = false, length = 32)
    private String cuil;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String apellido;

    @Column(name = "puesto_atencion_asignado", nullable = false, columnDefinition = "int default 0")
    private int puestoAtencionAsignado;

    @Column(nullable = false, columnDefinition = "int default 1")
    private int pendiente;

    @Column(nullable = false, columnDefinition = "int default 0")
    private int llamado;


}
