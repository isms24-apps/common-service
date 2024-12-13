package com.collections.commons.vo;

import java.io.Serializable;


import lombok.Data;

/**
 * @author tejasri
 */
@Data
public class PackVO implements Serializable {

	private static final long serialVersionUID = 600793270197332331L;

	private Long id;

	private String name;

	private Long packDetailsId;

	private Long categoryPackageId;
	
	private ApprovalStatus approvalStatus;

	private Boolean isActive;

	private PackDetailsVO packDetailsVO;

	private PlanType planType;

	private CustomPlanRequestVO customPlanRequestVO;
	
	private EshopUserVO user;
	
	private Boolean isDisplay;

}
