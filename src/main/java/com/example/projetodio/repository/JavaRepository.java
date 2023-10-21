package com.exemple.projetodio.repository;

import com.exemple.projetodio.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
}
