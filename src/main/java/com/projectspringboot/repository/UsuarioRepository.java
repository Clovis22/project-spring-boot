package com.projectspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspringboot.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByLogin(String login);
}
