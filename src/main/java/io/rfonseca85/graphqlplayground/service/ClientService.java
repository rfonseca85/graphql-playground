package io.rfonseca85.graphqlplayground.service;

import io.rfonseca85.graphqlplayground.dao.entity.Client;
import io.rfonseca85.graphqlplayground.dao.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientService {

  private final ClientRepository clientRepository;

  public ClientService(final ClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

  @Transactional
  public Client createClient(final String name, final int age) {
    return this.clientRepository.save(new Client(name,age));
  }

  @Transactional(readOnly = true)
  public List<Client> getAllClients(final int count) {
    return this.clientRepository.findAll().stream().limit(count).collect(Collectors.toList());
  }

  @Transactional(readOnly = true)
  public Optional<Client> getClient(final int id) {
    return this.clientRepository.findById(id);
  }

  @Transactional(readOnly = true)
  public List<Client> getClientsByName(String name) {
    return this.clientRepository.findClientsByName(name);
  }


}