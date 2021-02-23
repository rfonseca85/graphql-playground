package io.rfonseca85.graphqlplayground.dao.entity.inputs;

import io.rfonseca85.graphqlplayground.dao.entity.Currency;
import lombok.Data;

@Data
public class BankAccountInput {
  String name;
  Currency currency;
}
