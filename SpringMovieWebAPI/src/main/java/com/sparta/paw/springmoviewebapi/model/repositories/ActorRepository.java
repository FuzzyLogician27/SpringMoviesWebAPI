package com.sparta.paw.springmoviewebapi.model.repositories;

import com.sparta.paw.springmoviewebapi.model.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {

    List<Actor> findActorsByFirstName(String firsName);
    List<Actor> findActorsByLastName(String lastName);

    Optional<Actor> findActorByFirstName(String firstName);
    Optional<Actor> findActorByLastName(String lastName);


}
