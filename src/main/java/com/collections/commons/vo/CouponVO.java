package com.collections.commons.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * @author tejasri
 * 
 */
@Data
public class CouponVO implements Serializable {

  private static final long serialVersionUID = 2408976281137502722L;

  private Long id;

  private String code;

  private CouponType type;

  private String region;

  private LocalDateTime validFrom;

  private LocalDateTime validTo;

  private Long availedCount;

  private Boolean isAvailedEnabled;

  private Boolean isExpired;
  
  private Double discount;
 
  private Long userCount;
  
  private LocalDateTime lastModifiedDate;
  
}
