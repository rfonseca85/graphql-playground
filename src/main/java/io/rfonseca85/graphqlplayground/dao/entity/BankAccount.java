package io.rfonseca85.graphqlplayground.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class BankAccount implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ID", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "name", nullable = false)
  private String name;

  private Currency currency;

  public BankAccount() {super(); }

  public BankAccount(String name, Currency currency) {
    this.name = name;
    this.currency = currency;
  }

}