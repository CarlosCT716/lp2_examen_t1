package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="tbl_equipo_dental")
public class Equipo_DentalCarlosCT {
	@Id
	@Column(name="nro_equipo")
	private int nequipo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="costo")
	private double costo;
	@Column(name="fecha_adquisicion")
	private LocalDate fecha;
	@Column(name="estado")
	private String estado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_dentista")
	private DentistaCarlosCT dentista;
}
