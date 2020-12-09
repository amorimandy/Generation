package com.farm.Farmacia.controller;

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

import com.farm.Farmacia.model.Farmacia;
import com.farm.Farmacia.repository.FarmaciaRepository;

@RestController
@RequestMapping("/farmacia")
@CrossOrigin("*")
public class FarmaciaController {
	
	@Autowired
	private FarmaciaRepository repository;
	
	@GetMapping 
	public ResponseEntity<List<Farmacia>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Farmacia> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
		
	@PostMapping
	public ResponseEntity<Farmacia> post(@RequestBody Farmacia farmacia){
		return ResponseEntity.status(HttpStatus.CREATED)
		.body(repository.save(farmacia));
	}

	@PutMapping
	public ResponseEntity<Farmacia> put(@RequestBody Farmacia farmacia){
		return ResponseEntity.status(HttpStatus.OK)
		.body(repository.save(farmacia));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}


/*

No MySQL:
insert into tb_categoria(ativo, descricao) values (false, "paracetamol");
insert into tb_categoria(ativo, descricao) values (false, "glifage");
insert into tb_categoria(ativo, descricao) values (false, "propranolol");
insert into tb_categoria(ativo, descricao) values (true, "losartana");
insert into tb_categoria(ativo, descricao) values (true, "dorflex");
insert into tb_categoria(ativo, descricao) values (true, "nimesulida");
insert into tb_categoria(ativo, descricao) values (true, "omperazol");

Alterando com o POST:
	{
    	"id": 1,
    	"descricao": "Paracetamol",
    	"ativo": true
	}
	{
        "id": 1,
        "descricao": "Paracetamol",
        "ativo": true
    },
    {
        "id": 2,
        "descricao": "Glifage",
        "ativo": false
    },
    {
        "id": 3,
        "descricao": "Propranolol",
        "ativo": false
    },
    {
        "id": 4,
        "descricao": "Losartana",
        "ativo": true
    },
    {
        "id": 5,
        "descricao": "Dorflex",
        "ativo": true
    },
    {
        "id": 6,
        "descricao": "Nimesulida",
        "ativo": true
    },
    {
        "id": 7,
        "descricao": "Omperazol",
        "ativo": true
    }
    

Adicionando com o PUT:
    
   {
        "descricao": "Puran-T4",
        "ativo": true
    }
    
Deletando com o DELET:
    
   localhost:8080/farmacia/4
*/




