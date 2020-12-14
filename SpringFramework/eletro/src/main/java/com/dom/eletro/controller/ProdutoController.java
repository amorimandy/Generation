package com.dom.eletro.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dom.eletro.model.Produto;
import com.dom.eletro.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/preco/{valueIn}/{valueFim}")
	public ResponseEntity<List<Produto>> GetByPreco(@PathVariable BigDecimal valueIn, @PathVariable BigDecimal valueFim) {
		return ResponseEntity.ok(repository.findByPrecoBetween(valueIn, valueFim));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> put(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.OK)
				.body(repository.save(produto));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
