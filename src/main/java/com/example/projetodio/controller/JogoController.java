package com.example.projetodio.controller;

import com.exemple.projetodio.model.Jogo;
import com.exemple.projetodio.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public ResponseEntity<List<Jogo>> findAll() {
        return ResponseEntity.ok(jogoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jogo> findById(@PathVariable Long id) {
        Jogo jogo = jogoService.findById(id);
        if(jogo != null) {
            return ResponseEntity.ok(jogo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Jogo> create(@RequestBody Jogo jogo) {
        return ResponseEntity.ok(jogoService.save(jogo));
    }
}
