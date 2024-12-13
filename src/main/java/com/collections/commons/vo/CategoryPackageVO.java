package com.collections.commons.vo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

/**
 * @author tejasri
 * 
 */
@Data
public class CategoryPackageVO implements Serializable {

  private static final long serialVersionUID = 3512443649738203884L;

  private Long id;

  private String name;
  
  private LocalDateTime lastModifiedDate;
  
  private List<String> services;
  public List<String> getServices() {
		return services;
	}

	public void setServices(List<String> services) {
		this.services = services;
	}

}
