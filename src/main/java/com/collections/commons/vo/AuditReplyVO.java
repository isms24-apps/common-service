package com.collections.commons.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AuditReplyVO {

  private Long id;
  
  private LocalDateTime createdTime;
  
  private String answers;
  
  private AuditQuestionVO auditQuestion;
}
