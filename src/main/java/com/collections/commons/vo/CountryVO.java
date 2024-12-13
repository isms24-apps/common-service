package com.collections.commons.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @author tejasri
 * 
 */
@Data
public class CountryVO implements Serializable {

  private static final long serialVersionUID = -1958703253484271034L;

  private Long id;

  private String name;

  private String code;

  private String continentName;

  private String continentCode;

}
