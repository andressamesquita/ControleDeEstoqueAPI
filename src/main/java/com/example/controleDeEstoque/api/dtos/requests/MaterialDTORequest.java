package com.example.controleDeEstoque.api.dtos.requests;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.example.controleDeEstoque.domain.models.Material;

public class MaterialDTORequest {

	@NotNull
	private String nome;

	@Positive
	private double precoUnitario;

	@Positive
	private int quantidade;

	public MaterialDTORequest(@NotNull String nome, @Positive double precoUnitario, @Positive int quantidade) {
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}
	
	public Material toModel() {

		Material material = new Material(nome, precoUnitario, quantidade);
		return material;
	}

}
