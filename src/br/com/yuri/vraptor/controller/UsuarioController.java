package br.com.yuri.vraptor.controller;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.yuri.vraptor.dao.GenericDAO;
import br.com.yuri.vraptor.entity.Usuario;
import br.com.yuri.vraptor.jpa.BaseEntity;

@Resource
public class UsuarioController {
	
	private final GenericDAO dao;
	private final Result result;
	
	public UsuarioController(GenericDAO dao, Result result) {
		this.result   = result;
		this.dao      = dao;
	}
	
	@Path("/usuario/lista")
	public void lista() {
		List<BaseEntity> usuarios = dao.selectByNamedQuery("selectUsuarios");
		result.include("usuarios", usuarios);
	}
	
	@Path("/usuario/formulario")
	public void formulario() {
		
	}
	
	@Path("/usuario/editar/{usuario.id}")
	public void editar(Usuario usuario) {
		usuario = (Usuario) dao.selectById(usuario);
		if(usuario != null) {
			result.include("usuario", usuario);
		}
		result.redirectTo(this.getClass()).formulario();
	}
	
	@Post
	@Path("/usuario/salvar")
	public void salvar(Usuario usuario) {
		if(usuario != null) {
			if(usuario.getId() == null) {
				dao.insert(usuario);
			} else {
				dao.update(usuario);
			}
		}
		lista();
		result.redirectTo(this.getClass()).lista();
	}
	
	@Path("/usuario/excluir/{usuario.id}")
	public void excluir(Usuario usuario) {
		if(usuario != null && usuario.getId() != null) {
			dao.remove(usuario);
		}
		lista();
		result.redirectTo(this.getClass()).lista();
	}
	
}

