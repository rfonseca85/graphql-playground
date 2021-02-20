package io.rfonseca85.graphqlplayground.dao.repository;

import io.rfonseca85.graphqlplayground.dao.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {

  @Query("SELECT ba FROM BankAccount ba WHERE ba.name = ?1")
  List<BankAccount> findBankAccountsByName(String name);


}

