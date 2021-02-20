package io.rfonseca85.graphqlplayground.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import io.rfonseca85.graphqlplayground.dao.entity.Client;
import io.rfonseca85.graphqlplayground.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ClientResolver implements GraphQLQueryResolver {

  @Autowired
  private ClientService clientService;

  public List<Client> getClients(final int count) {
    return this.clientService.getAllClients(count);
  }

  public Optional<Client> getClient(final int id) {
    return this.clientService.getClient(id);
  }

  public List<Client> getClientsByName(final String name) {
    return this.clientService.getClientsByName(name);
  }
}