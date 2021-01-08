package com.example.controleDeEstoque.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.controleDeEstoque.api.dtos.requests.MaterialDTORequest;
import com.example.controleDeEstoque.api.dtos.responses.MaterialDTOResponse;
import com.example.controleDeEstoque.domain.models.Material;
import com.example.controleDeEstoque.domain.repositories.MaterialRepository;
import com.example.controleDeEstoque.domain.services.MaterialService;

@RestController
@RequestMapping(value = "/")
public class MaterialController {

	@Autowired
	MaterialService materialService;

	@Autowired
	MaterialRepository materialRepository;

	@PostMapping(path = "/materiais")
	public ResponseEntity<MaterialDTOResponse> cadastrar(@Valid @RequestBody MaterialDTORequest materialDTORequest,
			UriComponentsBuilder uriComponentsBuilder) {

		Material material = materialDTORequest.toModel();
		Material materialSalvo = materialService.cadastrarMaterial(material);

		MaterialDTOResponse materialDTOResponse = new MaterialDTOResponse(materialSalvo);

		return ResponseEntity
				.created(uriComponentsBuilder.path("/materiais/{id}").buildAndExpand(materialSalvo.getId()).toUri())
				.body(materialDTOResponse);
	}

	@GetMapping(path = "/materiais/lista")
	public List<Material> listarMateriais() {
		return materialRepository.findAll();
	}

//	@GetMapping(path = "/materiais/{id}")
//	public Optional<Material> buscarPorId(Long id) {
//		return materialRepository.findById(id);
//	}

}
