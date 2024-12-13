package com.collections.commons.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @author tejasri
 * 
 */
@Data
public class StandardCategoryVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8810150015511367311L;

	private Long id;

	private Long categoryId;

	private Long standardId;

	private Double basePrice;

	private Double discount;

	private Double netPrice;

	private String standardName;

	private String categoryName;

}
