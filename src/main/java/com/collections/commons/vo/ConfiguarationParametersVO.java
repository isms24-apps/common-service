package com.collections.commons.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * @author tejasri
 * 
 */
@Data
public class ConfiguarationParametersVO implements Serializable {

  private static final long serialVersionUID = 3312514539061379727L;

  private Long id;

  private String name;

  private String defaultValue;

  private String possibleValue;
  
  private LocalDateTime lastModifiedDate;

}
