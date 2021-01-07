package com.example.controleDeEstoque.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.controleDeEstoque.api.dtos.requests.MaterialDTORequest;
import com.example.controleDeEstoque.api.dtos.responses.MaterialDTOResponse;
import com.example.controleDeEstoque.domain.models.Material;
import com.example.controleDeEstoque.domain.services.MaterialService;

@RestController
@RequestMapping(value = "/")
public class MaterialController {

	@Autowired
	MaterialService materialService;

	@PostMapping(path = "/materiais")
	public ResponseEntity<MaterialDTOResponse> cadastrar(@Valid @RequestBody MaterialDTORequest materialDTORequest,
			UriComponentsBuilder uriComponentsBuilder) {

		Material material = materialDTORequest.toModel();
		Material materialSalvo = materialService.cadastrarMaterial(material);

		MaterialDTOResponse materialDTOResponse = new MaterialDTOResponse(materialSalvo);

		return ResponseEntity
				.created(uriComponentsBuilder.path("/materiais/{id}").buildAndExpand(material.getId()).toUri())
				.body(materialDTOResponse);
	}

}
