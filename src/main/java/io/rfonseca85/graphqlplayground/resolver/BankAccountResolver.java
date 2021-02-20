package io.rfonseca85.graphqlplayground.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import io.rfonseca85.graphqlplayground.dao.entity.BankAccount;
import io.rfonseca85.graphqlplayground.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BankAccountResolver implements GraphQLQueryResolver {

  @Autowired
  private BankAccountService bankAccountService;

  public List<BankAccount> getBankAccounts(final int count) {
    return this.bankAccountService.getAllBankAccounts(count);
  }

  public Optional<BankAccount> getBankAccount(final int id) {
    return this.bankAccountService.getBankAccount(id);
  }

  public List<BankAccount> getBankAccountsByName(final String name) {
    return this.bankAccountService.getBankAccountsByType(name);
  }
}