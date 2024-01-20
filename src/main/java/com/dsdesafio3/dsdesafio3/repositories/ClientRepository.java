package com.dsdesafio3.dsdesafio3.repositories;

import com.dsdesafio3.dsdesafio3.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
