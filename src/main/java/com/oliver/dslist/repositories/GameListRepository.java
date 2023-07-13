package com.oliver.dslist.repositories;

import com.oliver.dslist.models.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}