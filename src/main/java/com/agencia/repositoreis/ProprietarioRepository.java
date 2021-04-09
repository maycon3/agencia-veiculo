package com.agencia.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencia.domain.Proprietario;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Integer> {

}
