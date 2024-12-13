package com.collections.commons.vo;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

/**
 * @author Swetha
 *
 */
@Data
public class SubscriptionPackVO implements Serializable {

  private static final long serialVersionUID = -850085885883856154L;

  private Long id;

	private String packName;

	private String description;

	private Integer supportingHours;

	private LocalDate validInDays;

	private Long proficiencyId;

	private Double price;

	private Boolean isEnable;

}
