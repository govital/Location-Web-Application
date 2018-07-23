package com.udemy.e2elocationweb.repos;

import com.udemy.e2elocationweb.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
