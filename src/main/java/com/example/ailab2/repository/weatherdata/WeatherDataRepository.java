package com.example.ailab2.repository.weatherdata;

import com.example.ailab2.model.WeatherData;
import com.example.ailab2.model.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@RepositoryRestResource
public interface WeatherDataRepository extends JpaRepository<WeatherData, Long> {

    Page<WeatherData> findByTimestampGreaterThanEqualAndLocation(
            @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") LocalDateTime timestamp,
            Location location,
            Pageable pageable);
}