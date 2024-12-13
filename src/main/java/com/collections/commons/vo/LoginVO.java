package com.collections.commons.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @author tejasri
 * 
 */
@Data
public class LoginVO implements Serializable {

  private static final long serialVersionUID = 8369153020705484724L;

  private Long id;

  private String email;

  private String password;

}
