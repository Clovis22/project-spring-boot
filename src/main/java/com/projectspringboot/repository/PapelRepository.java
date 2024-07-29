package com.projectspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspringboot.models.Papel;

public interface PapelRepository extends JpaRepository<Papel, Long> {
	Papel findByPapel(String papel);
}
