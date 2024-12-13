package com.collections.commons.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @author tejasri
 * 
 */
@Data
public class PackDetailsVO implements Serializable {

  private static final long serialVersionUID = -9057159269448336607L;

  private Long id;

  private Double basePrice;

  private PackType type;

  private Double vat;

  private String typeRestriction;

  private Integer supportHours;

  private Integer validityInDays;

  private Double discount;

  private String description;

  private Double netPrice;

  private List<String> packageServices;
  
//  private Long userId;
  
  public void setDescription(String description) {
      if (description != null && description.length() > 2000) {
          throw new IllegalArgumentException("Description cannot be longer than 2000 characters");
      }
      this.description = description;
  }

}
