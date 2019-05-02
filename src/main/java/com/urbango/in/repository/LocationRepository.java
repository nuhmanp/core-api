package com.urbango.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.urbango.in.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
