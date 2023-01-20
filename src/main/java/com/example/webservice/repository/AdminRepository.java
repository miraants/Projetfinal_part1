package com.example.webservice.repository;

import com.example.webservice.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository  extends JpaRepository<Admin, Integer> {
}
