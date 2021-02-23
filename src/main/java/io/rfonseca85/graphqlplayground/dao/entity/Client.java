package io.rfonseca85.graphqlplayground.dao.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class Client implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ID", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "age")
  private int age;

  public Client() {
    super();
  }

  public Client(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
