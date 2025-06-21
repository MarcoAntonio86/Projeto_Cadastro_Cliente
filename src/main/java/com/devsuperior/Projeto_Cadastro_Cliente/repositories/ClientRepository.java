package com.devsuperior.Projeto_Cadastro_Cliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.Projeto_Cadastro_Cliente.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
