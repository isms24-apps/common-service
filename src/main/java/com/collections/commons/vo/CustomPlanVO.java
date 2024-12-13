package com.collections.commons.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @author Fahim
 *
 */
@Data
public class CustomPlanVO implements Serializable {

  private static final long serialVersionUID = 733497741812217286L;

  private Long id;

  private Boolean isMandatory;

  private Boolean isDisplay;

  private String name;

  private String type;

  private List<String> options;

  private Integer sequence;

  private CustomPlanEnumVO appliedFor;
}
