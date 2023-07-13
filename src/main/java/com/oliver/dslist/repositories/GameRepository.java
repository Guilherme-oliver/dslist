package com.oliver.dslist.repositories;

import com.oliver.dslist.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}