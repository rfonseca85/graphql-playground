package io.rfonseca85.graphqlplayground.dao.repository;

import io.rfonseca85.graphqlplayground.dao.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

  @Query("SELECT c FROM Client c WHERE c.name = ?1")
  List<Client> findClientsByName(String name);

}

