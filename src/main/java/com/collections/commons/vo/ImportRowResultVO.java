package com.collections.commons.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @author tejasri
 * 
 */
@Data
public class ImportRowResultVO implements Serializable {

  private static final long serialVersionUID = -8269640303150562555L;

  private Integer rowIndex;
  
  private String message;
  
  private String attribute;

}
