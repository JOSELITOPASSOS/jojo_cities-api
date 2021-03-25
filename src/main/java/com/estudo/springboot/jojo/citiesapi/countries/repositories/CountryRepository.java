package com.estudo.springboot.jojo.citiesapi.countries.repositories;

import com.estudo.springboot.jojo.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
