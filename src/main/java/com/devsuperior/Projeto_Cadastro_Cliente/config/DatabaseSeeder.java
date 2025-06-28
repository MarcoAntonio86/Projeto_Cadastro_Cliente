package com.devsuperior.Projeto_Cadastro_Cliente.config;

import com.devsuperior.Projeto_Cadastro_Cliente.entities.Client;
import com.devsuperior.Projeto_Cadastro_Cliente.repositories.ClientRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    private final ClientRepository repository;

    public DatabaseSeeder(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Client(null, "Maria Silva", "12345678901", 6500.0, LocalDate.of(1990, 5, 20), 2));
        repository.save(new Client(null, "João Oliveira", "98765432100", 7200.0, LocalDate.of(1985, 3, 15), 1));
        repository.save(new Client(null, "Ana Paula", "45678912300", 4500.0, LocalDate.of(1995, 8, 10), 0));
        repository.save(new Client(null, "Carlos Souza", "32165498700", 10000.0, LocalDate.of(1980, 11, 5), 3));
        repository.save(new Client(null, "Fernanda Lima", "15975345600", 8500.0, LocalDate.of(1992, 1, 30), 2));
        repository.save(new Client(null, "Ricardo Mendes", "75315985200", 3000.0, LocalDate.of(1998, 9, 12), 0));
        repository.save(new Client(null, "Paula Torres", "85296374100", 7800.0, LocalDate.of(1987, 7, 25), 1));
        repository.save(new Client(null, "Bruno Azevedo", "74185296300", 6200.0, LocalDate.of(1991, 4, 18), 2));
        repository.save(new Client(null, "Juliana Castro", "36925814700", 4000.0, LocalDate.of(1994, 12, 7), 1));
        repository.save(new Client(null, "Roberto Lima", "98732165400", 9200.0, LocalDate.of(1983, 6, 3), 4));
    }
}
