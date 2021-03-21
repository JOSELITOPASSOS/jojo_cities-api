package com.estudo.springboot.jojo.citiesapi.countries.repository;

import com.estudo.springboot.jojo.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
