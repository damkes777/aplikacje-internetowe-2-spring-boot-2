package com.example.ailab2.repository.location;

import com.example.ailab2.model.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LocationRepository extends JpaRepository<Location, Long> {

    Page<Location> findByCountryName(String countryName, Pageable pageable);

    Location findByCityName(String cityName);
}