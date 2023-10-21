package com.example.projetodio.repository;

import com.exemple.projetodio.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
