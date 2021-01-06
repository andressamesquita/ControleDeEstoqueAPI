package com.example.controleDeEstoque.api.dtos.requests;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class SuporteDTORequest {

	@NotNull
	private String nome;

	@NotNull
	private String tamanho; // conferir, eh pra usar cm (double)
	
	@NotNull
	private String cor;

	@Positive
	private double precoUnitario;

	@Positive
	private int quantidade;

	public SuporteDTORequest(@NotNull String nome, @NotNull String tamanho, @NotNull String cor,
			@Positive double precoUnitario, @Positive int quantidade) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.cor = cor;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}

	

}
