package com.example.controleDeEstoque.api.dtos.requests;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class EmbalagemDTORequest {

	@NotNull
	private String nome;

	@NotNull
	private String tamanho;

	@Positive
	private double precoUnitario;

	@Positive
	private int quantidade;

	public EmbalagemDTORequest(@NotNull String nome, @NotNull String tamanho, @Positive double precoUnitario,
			@Positive int quantidade) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}

}
