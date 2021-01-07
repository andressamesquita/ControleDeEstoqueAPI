package com.example.controleDeEstoque.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.controleDeEstoque.domain.models.Material;
import com.example.controleDeEstoque.domain.repositories.MaterialRepository;

@Service
public class MaterialService {

	@Autowired
	MaterialRepository materialRepository;

	public Material cadastrarMaterial(Material material) {

		double total = calcularTotal(material);
		material.setTotal(total);

		return materialRepository.save(material);
	}

	private double calcularTotal(Material material) {
		return material.getPrecoUnitario() * material.getQuantidade();
	}

}
