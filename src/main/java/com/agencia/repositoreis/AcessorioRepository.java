package com.agencia.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencia.domain.Acessorio;

@Repository
public interface AcessorioRepository extends JpaRepository<Acessorio, Integer> {

}
