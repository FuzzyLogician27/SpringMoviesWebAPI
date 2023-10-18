package com.sparta.paw.springmoviewebapi.controller;


import com.sparta.paw.springmoviewebapi.model.repositories.FilmRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilmWebController {

    private final FilmRepository filmRepository;


    public FilmWebController(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @GetMapping("/web/films")
    public String getAllFilms(Model model) {
        model.addAttribute("films", filmRepository.findAll());
        return "films";
    }

}
