package io.rfonseca85.graphqlplayground.resolver;

import graphql.kickstart.tools.GraphQLResolver;
import io.rfonseca85.graphqlplayground.dao.entity.BankAccount;
import io.rfonseca85.graphqlplayground.dao.entity.Client;
import io.rfonseca85.graphqlplayground.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {

  @Autowired
  ClientService clientService;

  public Client client(BankAccount bankAccount) {
    log.info("ClientResolver.client bankAccount.id:{}", bankAccount.getId());
    Client client = new Client("Rafael Fonseca", 36);
    client.setId(1);
    return client;
  }

//  public List<Client> getClients(final int count) {
//    return this.clientService.getAllClients(count);
//  }
//
//  public List<Client> getClientsByName(final String name) {
//    return this.clientService.getClientsByName(name);
//  }
}