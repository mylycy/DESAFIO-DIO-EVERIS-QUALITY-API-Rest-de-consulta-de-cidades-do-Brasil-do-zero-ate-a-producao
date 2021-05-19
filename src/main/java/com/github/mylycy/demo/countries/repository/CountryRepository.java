package com.github.mylycy.demo.countries.repository;

import com.github.mylycy.demo.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
