package com.example.controleDeEstoque.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.controleDeEstoque.domain.models.Embalagem;

public interface EmbalagemRepository extends JpaRepository<Embalagem, Long> {

}
