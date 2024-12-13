package com.collections.commons.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * @author Naveen
 */
@Data
public class CustomPlanRequestVO implements Serializable {

	private static final long serialVersionUID = 282264785943028259L;

	private Long id;

	private String requestObject;

	private LocalDateTime creationTime;

	private String region;

	private String customPlanSlug;

    private Boolean isApproved;
  
	private ApprovalStatus approvalStatus;

	private TicketStatus status;

//	private Double amount;

	private String rejectionMessage;

	private PackVO pack;
	
	private EshopUserVO user;

}
