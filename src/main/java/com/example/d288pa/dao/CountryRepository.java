package com.example.d288pa.dao;

import com.example.d288pa.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface CountryRepository extends JpaRepository<Country, Long> {
}
