package com.collections.commons.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class AuditSupportTrackVO {

  private Long id;
  
//  private TicketStatus status;
  
  private EshopUserVO assigneeId;
  
  private LocalDateTime assigneeTime;
  
  private Long createdBy;
  
  private LocalDateTime createdTime;
  
  private Long lastModifiedBy;
  
  private LocalDateTime lastModifiedTime;
  
  private AuditSupportVO auditSupport;
  
  private List<AuditQuestionVO> auditQuestions = new ArrayList<>();
}
