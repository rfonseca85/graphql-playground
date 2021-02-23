package io.rfonseca85.graphqlplayground.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import io.rfonseca85.graphqlplayground.dao.entity.BankAccount;
import io.rfonseca85.graphqlplayground.service.BankAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

  @Autowired
  private BankAccountService bankAccountService;

  public List<BankAccount> getBankAccounts(final int count) {
    log.info("BankAccountResolver.getBankAccounts");
    return this.bankAccountService.getAllBankAccounts(count);
  }

  public Optional<BankAccount> getBankAccount(final int id) {
    log.info("BankAccountResolver.getBankAccount id:{}",id);
    return this.bankAccountService.getBankAccount(id);
  }

  public List<BankAccount> getBankAccountsByName(final String name) {
    log.info("BankAccountResolver.getBankAccountsByName name:{}",name);
    return this.bankAccountService.getBankAccountsByName(name);
  }
}