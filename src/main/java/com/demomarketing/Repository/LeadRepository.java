package com.demomarketing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demomarketing.Entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
