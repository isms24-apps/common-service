package com.collections.commons.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * @author chippala
 *
 */
@Data
public class StandardVO implements Serializable {

  private static final long serialVersionUID = 5647333198100604873L;

  private Long id;

 
  private String name;

  private String revisionYear;

  private Double basePrice;

  private Double discount;

  private Double netPrice;
  
  private LocalDateTime lastModifiedDate;
  
  private Long cmsStandardId;

  private Boolean isEnable;
  
  public void setName(String name) {
      if (name == null || name.trim().isEmpty()) {
          throw new IllegalArgumentException("Standard name should not be empty");
      }
      this.name = name;
  }

}
