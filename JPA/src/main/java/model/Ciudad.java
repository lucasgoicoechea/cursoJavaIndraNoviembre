package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "ciudades")
public class Ciudad implements Serializable {
	private static final long serialVersionUID = -1L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "nombre")
	private String nombre;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_pais")
	private Pais pais;
}