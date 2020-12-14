package com.dom.eletro.repository;

import java.math.BigDecimal;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dom.eletro.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

	public List<Produto> findByPrecoBetween(BigDecimal valueIn, BigDecimal valueFim);
	
	public List<Produto> findByIdAndPrecoLessThan(Long id, BigDecimal preco);
	
	//@Query(value = "select * from tb_produto inner where eletro.id = :tipo_Id and preco <= :preco", nativeQuery = true)
	//public List<Produto> findByTipoAndPreco(@Param("tipo_id") long tipoId, @Param("valor") BigDecimal preco);
	
}
