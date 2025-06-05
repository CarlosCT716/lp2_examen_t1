package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_dentista")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter @Setter
public class DentistaCarlosCT {
	@Id
	@Column(name="id_dentista")
	private int codigo;
	@Column(name="cop")
	private int cop;
	@Column(name="nombre_completo")
	private String nombres;
	@Column(name="fecha_inicio_contrato")
	private LocalDate fecha;
	@Column(name="turno")
	private String turno;
	@Column(name="correo")
	private String correo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_especialidad")
	private EspecialidadCarlosCT especialidad;
	
	@Override
	public String toString() {
		return nombres;
	}

}
