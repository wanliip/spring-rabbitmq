package com.littlersmall.rabbitmqaccess.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by littlersmall on 16/6/28.
 */
// for example
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserMessage {
  private int id;
  private String name;

  public UserMessage(int i, String string) {
    this.id = i;
    this.name = string;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
