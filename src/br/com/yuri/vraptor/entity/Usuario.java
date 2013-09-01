package br.com.yuri.vraptor.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Usuario extends br.com.yuri.vraptor.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USUARIO_ID_GENERATOR", sequenceName="USUARIO_ID_SEQ")
	@GeneratedValue(generator="USUARIO_ID_GENERATOR")
	private Integer id;

	@Column(name="ds_email")
	private String dsEmail;

	@Column(name="ds_login")
	private String dsLogin;

	@Column(name="ic_email_publico")
	private boolean icEmailPublico;

	@Column(name="id_tipo_usuario")
	private Integer idTipoUsuario;

	@Column(name="nm_usuario")
	private String nmUsuario;

	//uni-directional many-to-one association to Grupo
	@ManyToOne(fetch=FetchType.EAGER)
	private Grupo grupo;

    public Usuario() {
    }

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDsEmail() {
		return this.dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	public String getDsLogin() {
		return this.dsLogin;
	}

	public void setDsLogin(String dsLogin) {
		this.dsLogin = dsLogin;
	}

	public Integer getIdTipoUsuario() {
		return this.idTipoUsuario;
	}

	public void setIdTipoUsuario(Integer idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getNmUsuario() {
		return this.nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	public Grupo getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public boolean isIcEmailPublico() {
		return icEmailPublico;
	}

	public void setIcEmailPublico(boolean icEmailPublico) {
		this.icEmailPublico = icEmailPublico;
	}
	
}