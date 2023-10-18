package com.sparta.paw.springmoviewebapi.model.repositories;


import com.sparta.paw.springmoviewebapi.model.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FilmRepository  extends JpaRepository<Film, Integer> {

    List<Film> findFilmsByTitle(String title);

    List<Film> findFilmsByTitleStartingWith(String letter);

    Optional<Film> findFilmByTitle(String title);

}
