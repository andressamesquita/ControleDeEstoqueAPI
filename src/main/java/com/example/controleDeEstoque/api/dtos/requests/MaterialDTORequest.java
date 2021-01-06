package com.example.controleDeEstoque.api.dtos.requests;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

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

}
