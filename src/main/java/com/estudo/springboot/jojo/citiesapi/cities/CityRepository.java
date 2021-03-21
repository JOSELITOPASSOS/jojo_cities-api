package com.estudo.springboot.jojo.citiesapi.cities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
