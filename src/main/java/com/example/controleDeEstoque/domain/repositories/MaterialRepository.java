package com.example.controleDeEstoque.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.controleDeEstoque.domain.models.Material;

public interface MaterialRepository extends JpaRepository<Material, Long> {

}
