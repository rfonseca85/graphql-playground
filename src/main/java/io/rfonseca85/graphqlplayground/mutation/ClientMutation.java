package io.rfonseca85.graphqlplayground.mutation;

import graphql.kickstart.tools.GraphQLMutationResolver;
import io.rfonseca85.graphqlplayground.dao.entity.Client;
import io.rfonseca85.graphqlplayground.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientMutation implements GraphQLMutationResolver {

  @Autowired
  private ClientService clientService;

  public Client createClient(final String name, final int age) {
    return this.clientService.createClient(name, age);
  }
}