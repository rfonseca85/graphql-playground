package io.rfonseca85.graphqlplayground;

import io.rfonseca85.graphqlplayground.dao.entity.BankAccount;
import io.rfonseca85.graphqlplayground.dao.entity.Client;
import io.rfonseca85.graphqlplayground.dao.entity.Currency;
import io.rfonseca85.graphqlplayground.service.BankAccountService;
import io.rfonseca85.graphqlplayground.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GraphqlPlaygroundDataLoad {

  @Autowired
  BankAccountService bankAccountService;

  @Autowired
  ClientService clientService;

  @Bean
  CommandLineRunner loadingInitialBankAccounts() {
    List<BankAccount> bankAccounts = new ArrayList<>();
    bankAccounts.add(new BankAccount("Scotiabank", Currency.CAD));
    bankAccounts.add(new BankAccount("TD", Currency.CAD));
    bankAccounts.add(new BankAccount("HSBC", Currency.USD));
    bankAccounts.add(new BankAccount("Tangerine", Currency.CAD));
    bankAccounts.add(new BankAccount("Bradesco", Currency.BRL));
    bankAccounts.add(new BankAccount("Itau", Currency.BRL));
    return args -> bankAccounts
            .forEach(contact -> bankAccountService.createBankAccount(contact.getName(), contact.getCurrency()));
  }

  @Bean
  CommandLineRunner loadingInitialClients() {
    List<Client> clients = new ArrayList<>();
    clients.add(new Client("Rafael", 36));
    clients.add(new Client("Ana Gabriela", 36));
    clients.add(new Client("Amora Lopes", 36));
    return args -> clients.forEach(client -> clientService.createClient(client.getName(), client.getAge()));
  }
}
