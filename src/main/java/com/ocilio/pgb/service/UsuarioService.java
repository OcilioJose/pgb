package com.ocilio.pgb.service;

import com.ocilio.pgb.dominio.model.Usuario;

public interface UsuarioService {

	public Usuario buscarPeloId(Long id);

	public Usuario criar(Usuario usuario);
}
