package com.estudo.springboot.jojo.citiesapi.staties.repositories;

import com.estudo.springboot.jojo.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository <State, Long> {
}
