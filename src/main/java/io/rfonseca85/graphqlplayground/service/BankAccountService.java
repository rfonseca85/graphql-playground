package io.rfonseca85.graphqlplayground.service;

import io.rfonseca85.graphqlplayground.dao.entity.BankAccount;
import io.rfonseca85.graphqlplayground.dao.entity.Currency;
import io.rfonseca85.graphqlplayground.dao.repository.BankAccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BankAccountService {

  private final BankAccountRepository bankAccountRepository;

  public BankAccountService(final BankAccountRepository bankAccountRepository) {
    this.bankAccountRepository = bankAccountRepository;
  }

  @Transactional
  public BankAccount createBankAccount(final String name, final Currency currency) {

    final BankAccount bankAccount = new BankAccount(name, currency);
    return this.bankAccountRepository.save(bankAccount);
  }

  @Transactional(readOnly = true)
  public List<BankAccount> getAllBankAccounts(final int count) {
    return this.bankAccountRepository.findAll().stream().limit(count).collect(Collectors.toList());
  }

  @Transactional(readOnly = true)
  public Optional<BankAccount> getBankAccount(final int id) {
    return this.bankAccountRepository.findById(id);
  }

  @Transactional(readOnly = true)
  public List<BankAccount> getBankAccountsByName(String name) {
    return this.bankAccountRepository.findBankAccountsByName(name);
  }


}