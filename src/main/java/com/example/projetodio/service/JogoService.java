package com.example.projetodio.service;

import com.exemple.projetodio.model.Jogo;
import com.exemple.projetodio.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    public List<Jogo> findAll() {
        return jogoRepository.findAll();
    }

    public Jogo findById(Long id) {
        return jogoRepository.findById(id).orElse(null);
    }

    public Jogo save(Jogo jogo) {
        return jogoRepository.save(jogo);
    }
}

