package io.rfonseca85.graphqlplayground.mutation;

import graphql.kickstart.tools.GraphQLMutationResolver;
import io.rfonseca85.graphqlplayground.dao.entity.BankAccount;
import io.rfonseca85.graphqlplayground.dao.entity.Currency;
import io.rfonseca85.graphqlplayground.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankAccountMutation implements GraphQLMutationResolver {

  @Autowired
  private BankAccountService bankAccountService;

  public BankAccount createBankAccount(final String name, final Currency currency) {
    return this.bankAccountService.createBankAccount(name, currency);
  }
}