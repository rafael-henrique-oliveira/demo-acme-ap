package com.rafaeloliveira.demoacmeap.repository;

import com.rafaeloliveira.demoacmeap.domain.Fatura;
import com.rafaeloliveira.demoacmeap.domain.Instalacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {

    public Optional<Fatura> findByCodigo(String codigo);
    public List<Fatura> findByInstalacao(Instalacao instalacao);

}
