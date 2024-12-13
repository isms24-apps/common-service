package com.collections.commons.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class AuditQuestionVO {

  private Long id;
  
  private LocalDateTime createdTime;
  
  private String question;
  
  private AuditSupportTrackVO auditSupportTrackVO;
  
  private List<AuditReplyVO> auditReplies = new ArrayList<>();
}
