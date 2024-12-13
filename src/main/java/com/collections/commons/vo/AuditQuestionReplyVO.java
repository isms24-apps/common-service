package com.collections.commons.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AuditQuestionReplyVO {
  
  public AuditQuestionReplyVO(String question, LocalDateTime questionCreatedTime, String answer, LocalDateTime answerCreatedTime) {
    this.question = question;
    this.createdTime = questionCreatedTime;
    this.answer = answer;
    this.answerCreatedTime = answerCreatedTime;
}
  private Long id;
  
  private LocalDateTime createdTime;
  
  private String question;
  
  private LocalDateTime answerCreatedTime;
  
  private String answer;
  
}
