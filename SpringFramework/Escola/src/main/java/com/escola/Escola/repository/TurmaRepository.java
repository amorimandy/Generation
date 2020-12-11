package com.escola.Escola.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.escola.Escola.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{
	
	public List<Turma> findAllByTurma(String turma);
}
