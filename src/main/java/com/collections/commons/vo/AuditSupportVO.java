package com.collections.commons.vo;

import lombok.Data;

/**
 * A Data Transfer Object (DTO) for audit support.
 */
@Data
public class AuditSupportVO {

    private Long id;

    private String companyEmail;

    private String firstName;

    private String lastName;

    private String slug;

    private String companyName;

    private String jobTitle;

    private String inquiryAbout;

    private String question; // Remove @Size annotation

    private TicketStatusVO status;

    // Optionally, you could add validation logic manually if needed.
    // For example:
    public void setQuestion(String question) {
        if (question != null && question.length() > 2000) {
            throw new IllegalArgumentException("Question cannot be longer than 2000 characters.");
        }
        this.question = question;
    }
}
