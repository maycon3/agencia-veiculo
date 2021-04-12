package com.agencia.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agencia.domain.Veiculo;
import com.agencia.domain.VeiculoId;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

}
