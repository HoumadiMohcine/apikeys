package com.example.apikeys.repository;

import com.example.apikeys.entities.Apikeys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApiKeysRepository extends JpaRepository<Apikeys,Long> {
    List<Apikeys> findByUsername(String username);
}
