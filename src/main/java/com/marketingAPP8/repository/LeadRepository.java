package com.marketingAPP8.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingAPP8.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
