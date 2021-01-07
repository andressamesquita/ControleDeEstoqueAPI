package com.example.controleDeEstoque.api.dtos.responses;

import com.example.controleDeEstoque.domain.models.Material;

public class MaterialDTOResponse {

	private Long id;
	private String nome;
	private double precoUnitario;
	private int quantidade;
	private double total;

	public MaterialDTOResponse(Material material) {
		this.id = material.getId();
		this.nome = material.getNome();
		this.precoUnitario = material.getPrecoUnitario();
		this.quantidade = material.getQuantidade();
		this.total = material.getTotal();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getTotal() {
		return total;
	}

}
