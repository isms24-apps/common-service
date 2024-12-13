package com.collections.commons.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @author tejasri
 * 
 */
@Data
public class DocumentSuiteVO implements Serializable {

  private static final long serialVersionUID = -210241321018233707L;

  private Long id;

  private Long documentId;

  private List<Long> standardIds;

}
