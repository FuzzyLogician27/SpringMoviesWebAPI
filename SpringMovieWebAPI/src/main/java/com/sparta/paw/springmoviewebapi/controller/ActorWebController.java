package com.sparta.paw.springmoviewebapi.controller;


import com.sparta.paw.springmoviewebapi.model.repositories.ActorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActorWebController {

    private final ActorRepository actorRepository;


    public ActorWebController(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @GetMapping("/web/actors")
    public String getAllActors(Model model) {
        model.addAttribute("actors", actorRepository.findAll());
        return "actors";
    }
}
