package io.rfonseca85.graphqlplayground.resolver;

import graphql.kickstart.tools.GraphQLResolver;
import io.rfonseca85.graphqlplayground.dao.entity.BankAccount;
import io.rfonseca85.graphqlplayground.dao.entity.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {

  public Client client(BankAccount bankAccount) {
    log.info("ClientResolver.client bankAccount.id:{}",bankAccount.getId());
    return Client.builder().id(1).name("Rafael Fonseca").age(36).build();
  }

//  public List<Client> getClients(final int count) {
//    return this.clientService.getAllClients(count);
//  }
//
//
//  public List<Client> getClientsByName(final String name) {
//    return this.clientService.getClientsByName(name);
//  }
}