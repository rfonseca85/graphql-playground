package io.rfonseca85.graphqlplayground.mutation;

import graphql.kickstart.tools.GraphQLMutationResolver;
import io.rfonseca85.graphqlplayground.dao.entity.BankAccount;
import io.rfonseca85.graphqlplayground.dao.entity.inputs.BankAccountInput;
import io.rfonseca85.graphqlplayground.dao.entity.Currency;
import io.rfonseca85.graphqlplayground.service.BankAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BankAccountMutation implements GraphQLMutationResolver {

  @Autowired
  private BankAccountService bankAccountService;

  public BankAccount createBankAccount(BankAccountInput input) {
    log.info("BankAccountMutation.createBankAccount BankAccountInput.name:{}",input.getName());
    return this.bankAccountService.createBankAccount(input.getName(), input.getCurrency());
  }
}