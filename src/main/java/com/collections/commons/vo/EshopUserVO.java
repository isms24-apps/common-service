package com.collections.commons.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @author tejasri
 * 
 */
@Data
public class EshopUserVO implements Serializable {

  private static final long serialVersionUID = -3740011444981521953L;

  private Long id;

  private String firstName;

  private String lastName;

  private String email;

  private String password;

  private String address;
  
  private Long roleId;

  private String roleName;
  
  private String registerVia;
  
  private String mobile;
  
  private String region;

}
