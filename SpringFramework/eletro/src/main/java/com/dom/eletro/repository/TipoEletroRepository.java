package com.dom.eletro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dom.eletro.model.TipoEletro;

@Repository
public interface TipoEletroRepository extends JpaRepository<TipoEletro, Long>{

	public List<TipoEletro> findAllByDescricaoContainingIgnoreCase(String descricao);
}
