package com.collections.commons.vo;

import java.io.Serializable;
import java.util.Set;

import lombok.Data;

/**
 * @author chippala
 *
 */
@Data
public class DocumentLocationVO implements Serializable {

  private static final long serialVersionUID = -1422722696642057104L;

  private Long id;

  private String docUId;

  private String fileName;

  private Long langId;

  private Set<LocaleVO> locales;

  private Boolean isFileUpdated;

}
