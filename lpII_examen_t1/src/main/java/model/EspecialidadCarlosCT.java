package model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="tbl_especialidad")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EspecialidadCarlosCT {
	@Id
	@Column(name="id_especialidad")
	@EqualsAndHashCode.Include
	private int codigo;
	@Column(name="titulo")
	private String titulo;
}
