package com.ocilio.pgb.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ocilio.pgb.dominio.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	//busca a Conta pelo campo Numero - Conta::Numero
	boolean existsByContaNumero(String numero);
}
