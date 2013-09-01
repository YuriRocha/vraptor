package br.com.yuri.vraptor.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Grupo extends br.com.yuri.vraptor.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GRUPO_ID_GENERATOR", sequenceName="GRUPO_ID_SEQ")
	@GeneratedValue(generator="GRUPO_ID_GENERATOR")
	private Integer id;

	@Column(name="nm_grupo")
	private String nmGrupo;

    public Grupo() {
    }

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNmGrupo() {
		return this.nmGrupo;
	}

	public void setNmGrupo(String nmGrupo) {
		this.nmGrupo = nmGrupo;
	}

}